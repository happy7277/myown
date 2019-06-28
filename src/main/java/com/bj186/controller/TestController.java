package com.bj186.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test1")
    @ResponseBody
    public void test1(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        System.out.println(loginUser);
    }

}
