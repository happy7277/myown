package com.bj186.service;

import com.bj186.pojo.Access;

import java.util.List;

public interface AccessService {

    int insertAccess(Access access);

    int updateAccess(Access access);

    List<Access> selectAccessList();

    List<Access> selectAccess(Access access);
}
