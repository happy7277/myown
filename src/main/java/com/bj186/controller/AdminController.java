package com.bj186.controller;


import com.bj186.pojo.Admin;
import com.bj186.service.AdminService;
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

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        System.out.println("--------------------------AdminController构造函数");
        this.adminService = adminService;

    }

    @RequestMapping(value = "/login")
    public String loginAdmin(@RequestParam String username, @RequestParam String password) {
        System.out.println("AdminController --------------------------loginAdmin");
        System.out.println("AdminController ------username=" + username);
        System.out.println("AdminController ------password=" + password);

        Subject currentAdmin = SecurityUtils.getSubject();                                     // shiro权限认证主体对象
        if (!currentAdmin.isAuthenticated()) {
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);    // shiro权限认证类型
            upToken.setRememberMe(true);                                                     // 用户登录时效性
            System.out.println();
            try {
                currentAdmin.login(upToken);    // 调用realm认证用户权限
                return "redirect:/index.html";
            } catch (IncorrectCredentialsException ice) {
                System.out.println("用户名/密码不匹配！");
            } catch (LockedAccountException lae) {
                System.out.println("账户已被冻结！");
            } catch (UnknownAccountException uae) {
                System.out.println("账户不存在");
            } catch (AuthenticationException ae) {
                System.out.println(ae.getMessage());
            }
        }
        return "redirect:/loginadmin.html";
    }


    @RequestMapping(value = "/reg")
    public String regAdmin(@RequestParam String username, @RequestParam String password) {
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        Admin admin = new Admin();
        System.out.println(admin);
        admin.setAdminName(username);
        String pwd = md5(username, password).toString();
        System.out.println("加盐加密pwd=="+pwd);
        admin.setAdminPassword(md5(username,password));
        System.out.println(admin);
        adminService.regAdmin(admin);
        return "redirect:/loginadmin.html";
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
