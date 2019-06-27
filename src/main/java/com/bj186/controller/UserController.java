package com.bj186.controller;


import com.bj186.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        System.out.println("--------------------------UserController构造函数");
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public Map loginUser(@RequestParam String username, @RequestParam String password) {
        System.out.println("UserController --------------------------selectUser");
        System.out.println("UserController ------username=" + username);
        System.out.println("UserController ------password=" + password);
        Map map = new HashMap<>();
        Subject currentUser = SecurityUtils.getSubject(); // shiro权限认证主体对象
        System.out.println(currentUser.isAuthenticated());
        if (!currentUser.isAuthenticated()) {//判断是否已登陆
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);// shiro权限认证类型，未登录，将用户名密码封装成tonken
            upToken.setRememberMe(true);// 用户登录时效性
            try {
                currentUser.login(upToken);    // 调用realm认证用户权限
                map.put("returncode",1);
                map.put("msg","登陆成功");
                List list = new ArrayList();
                map.put("data",list);
                return map;
            } catch (IncorrectCredentialsException ice) {
                map.put("msg","用户名/密码不匹配！");
                map.put("returncode",-1);
                System.out.println("用户名/密码不匹配！");
                return map;
            } catch (LockedAccountException lae) {
                map.put("msg","账户已被冻结！");
                map.put("returncode",-1);
                System.out.println("账户已被冻结！");
                return map;
            } catch (UnknownAccountException uae) {
                map.put("msg","账户不存在");
                map.put("returncode",-1);
                System.out.println("账户不存在");
                return map;
            } catch (AuthenticationException ae) {
                map.put("msg","未知异常");
                map.put("returncode",-1);
                System.out.println(ae.getMessage());
                return map;
            }
        }
        return map;
    }


    @RequestMapping(value = "/reg")
    public String regUser(@RequestParam String username, @RequestParam String password) {
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        userService.regUser(username, md5(username, password));
        return "redirect:/login.html";
    }

    // 注册时，进行shiro加密，返回加密后的结果，如果在加入shiro之前，存在用户密码不是此方式加密的，那么将无法登录
    // 使用用户名作为盐值
    private String md5(String username, String password){
        String hashAlgorithmName = "MD5";                   // 加密方式
        ByteSource salt = ByteSource.Util.bytes(username);  // 以账号作为盐值
        int hashIterations = 11;                            // 加密11次
        return new SimpleHash(hashAlgorithmName, password, salt, hashIterations).toString();
    }
}
