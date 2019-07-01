package com.bj186.mapper;

import com.bj186.pojo.Access;

import java.util.List;

public interface AccessMapper {

    int insertAccess(Access access);

    int updateAccess(Access access);

    List<Access> selectAccessList();

    List<Access> selectAccess(Access access);


}