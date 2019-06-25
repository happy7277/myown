package com.bj186.mapper;

import com.bj186.pojo.Car;

import java.util.List;

public interface CarMapper {

    int insertCar(Car car); //增加车辆信息

    int updateCar(Car car);//修改登记车辆信息

    List<Car> selectCar(Car car);  //查找车辆信息,返回的事一个列表




}