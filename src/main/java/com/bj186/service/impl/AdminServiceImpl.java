package com.bj186.service.impl;

import com.bj186.mapper.AdminMapper;
import com.bj186.pojo.Admin;
import com.bj186.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    private AdminMapper adminMapper;
    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin loginAdmin(Admin admin) {
        return this.adminMapper.loginAdmin(admin);
    }

    @Override
    public void regAdmin(Admin admin) {
        System.out.println(admin);
        this.adminMapper.insertAdmin(admin);
    }

    @Override
    public Admin getAdmin(String username) {
        return this.adminMapper.getAdmin(username);
    }
}
