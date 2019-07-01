package com.bj186.mapper;

import com.bj186.pojo.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertAdmin(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    Admin loginAdmin(Admin admin);

    Admin getAdmin(String username);

    void regAdmin(String username,String password);
}