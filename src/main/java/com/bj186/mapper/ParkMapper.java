package com.bj186.mapper;

import com.bj186.pojo.Park;

import java.util.List;

public interface ParkMapper {

    int insertPark(Park park);

    int updatePark(Park record);

    List<Park> selectPark(Park park);

    List<Park> selectParkList(Park park);

}