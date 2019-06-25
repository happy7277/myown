package com.bj186.mapper;

import com.bj186.pojo.Car;

import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(Car car);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer carId);

    Car selectCarBycarcard(String carcard);

    List<Car> selectCarByUid(Integer uid);

    List<Car> selectCarByPid(Integer uid);

    List<Car> selectCarList();

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}