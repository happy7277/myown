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

    public List<Car> selectCar(Car car){
        List<Car> cars = carService.selectCar(car);
        return cars;
    }

    public List<Car> selectCarList(Car car){
        List<Car> cars = carService.selectCarList(car);
        return cars;
    }

    public int insert(Car car){
        return carService.insertCar(car);
    }

    public int updateCar(Car car){
         return carService.updateCar(car);
    }


}
