package com.bj186.service;

import com.bj186.pojo.Car;

import java.util.List;

public interface CarService {
    Car selectCarBycarcard(String carcard);

    List<Car> selectCarByUid(Integer uid);

    List<Car> selectCarByPid(Integer uid);

    List<Car> selectCarList();

    int insert(Car car);//新登记车辆
}
