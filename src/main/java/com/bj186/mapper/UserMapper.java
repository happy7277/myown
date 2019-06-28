package com.bj186.mapper;

import com.bj186.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateByPhone(User record);//通过电话重置密码

    User getUserByphone(String phonenumber);//通过电话查找用户

    List<User> selectUser();

    User getUser(String username);

    void regUser(String username, String password);

    User loginUser(User user);//登陆使用的方法


}