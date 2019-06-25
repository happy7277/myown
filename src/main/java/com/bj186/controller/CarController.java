package com.bj186.controller;

import com.bj186.pojo.Car;
import com.bj186.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        System.out.println("--------------------------CarController构造函数");
        this.carService = carService;
    }

    public List<Car> selectCarList(){
        List<Car> cars = carService.selectCarList();
        return cars;
    }

    public List<Car> selectCarByUid(Integer uid){
        List<Car> cars = carService.selectCarByUid(uid);
        return cars;
    }
    public List<Car> selectCarByPid(Integer pid){
        List<Car> cars = carService.selectCarByPid(pid);
        return cars;
    }

    public int insert(Car car){
        return carService.insert(car);
    }


}
