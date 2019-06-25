package com.bj186.service.impl;

import com.bj186.mapper.CarMapper;
import com.bj186.pojo.Car;
import com.bj186.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CarService")
public class CarServiceImpl implements CarService {

    private  CarMapper carMapper;
    //构造方法
    @Autowired
    public CarServiceImpl(CarMapper carMapper){
        this.carMapper = carMapper;
    }

    @Override
    public Car selectCarBycarcard(String carcard) {
        return this.carMapper.selectCarBycarcard(carcard);
    }

    @Override
    public List<Car> selectCarByUid(Integer uid) {
        return this.carMapper.selectCarByUid(uid);
    }

    @Override
    public List<Car> selectCarByPid(Integer pid) {
        return this.carMapper.selectCarByPid(pid);
    }

    @Override
    public List<Car> selectCarList() {
        return this.carMapper.selectCarList();
    }

    @Override
    public int insert(Car car) {

        return this.carMapper.insert(car);
    }
}
