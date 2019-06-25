package com.bj186.service;

import com.bj186.mapper.UserMapper;
import com.bj186.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectUser() {
        return userMapper.selectUser();
    }

     //   @Transactional(rollbackFor = Exception.class)
    public User getUser(String username) {
        return userMapper.getUser(username);
    }

     //   @Transactional(rollbackFor = Exception.class)
    public void regUser(String username, String password) {
        userMapper.regUser(username, password);
    }
}

