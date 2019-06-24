package com.bj186.mapper;

import com.bj186.pojo.MsgCount;

public interface MsgCountMapper {
    int deleteByPrimaryKey(Integer msgcountId);

    int insert(MsgCount record);

    int insertSelective(MsgCount record);

    MsgCount selectByPrimaryKey(Integer msgcountId);

    int updateByPrimaryKeySelective(MsgCount record);

    int updateByPrimaryKey(MsgCount record);
}