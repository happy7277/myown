package com.bj186.service;

import com.bj186.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> selectUser();

    public User getUser(String username);

    public void regUser(String username, String password);

    User loginUser(User user);//登陆使用的方法

}
