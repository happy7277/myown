package com.bj186.mapper;

import com.bj186.pojo.Park;

public interface ParkMapper {
    int deleteByPrimaryKey(Integer parkId);

    int insert(Park record);

    int insertSelective(Park record);

    Park selectByPrimaryKey(Integer parkId);

    int updateByPrimaryKeySelective(Park record);

    int updateByPrimaryKey(Park record);
}