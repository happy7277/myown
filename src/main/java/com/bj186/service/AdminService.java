package com.bj186.service;

import com.bj186.pojo.Admin;

public interface AdminService {

    Admin loginAdmin(Admin admin);

    void regAdmin(Admin admin);

    Admin getAdmin(String username);


}
