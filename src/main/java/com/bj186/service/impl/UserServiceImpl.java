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

    @Override
    public User loginUser(User user) {
        User loginUser = this.userMapper.loginUser(user);
        return loginUser;
    }

    @Override
    public User getUserByphone(String phonenumber) {
        return this.userMapper.getUserByphone(phonenumber);
    }

    @Override
    public int updateByPhone(User record) {
        return this.userMapper.updateByPhone(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }
}

