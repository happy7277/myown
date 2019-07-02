package com.bj186.service;

import com.bj186.pojo.User;

import java.util.List;

public interface UserService {

    public User getUser(String username);

    public void regUser(String username, String password);

    User loginUser(User user);//登陆使用的方法

    User getUserByphone(String phonenumber);//通过电话查找用户

    int updateByPhone(User record);//通过电话重置密码

    int updateByPrimaryKey(User record);

    List<User> selectUser(User user);


}
