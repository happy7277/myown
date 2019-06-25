package com.bj186.service.impl;

import com.bj186.mapper.UserMapper;
import com.bj186.pojo.User;
import com.bj186.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    private  UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectUser() {
        return userMapper.selectUser();

    }

    //    @Transactional(rollbackFor = Exception.class)
    public User getUser(String username) {
        return userMapper.getUser(username);
    }

    //    @Transactional(rollbackFor = Exception.class)
    public void regUser(String username, String password) {
        userMapper.regUser(username, password);
    }
}
