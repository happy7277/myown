package com.bj186.controller;

import com.bj186.pojo.Car;
import com.bj186.pojo.Park;
import com.bj186.pojo.User;
import com.bj186.service.CarService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/cars")
@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        System.out.println("--------------------------CarController构造函数");
        this.carService = carService;
    }



    public Map selectCar(Car car, HttpServletResponse response, HttpServletRequest request){
        Map map = new HashMap<>();
        List<Car> cars = carService.selectCar(car);

        return map;
    }
    @RequestMapping("/carlist")
    public void selectCarList(HttpServletResponse response, HttpServletRequest request){
        System.out.println("后台:cars/carlist--------");
        Map map = new HashMap<>();
        Car car = new Car();
        List<Car> cars = carService.selectCarList(car);
        System.out.println(cars);
        map.put("data",cars);
        map.put("code","");
        map.put("msg","");
        map.put("count",cars.size());
        JSONObject json = new JSONObject(map);
        response.setCharacterEncoding("utf-8");
        try {
            response.getWriter().write(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/caradd")
    @ResponseBody
    public Map insert(@RequestBody Car car){
        System.out.println("注入的对象：----------------");
        System.out.println(car);
        System.out.println("注入的对象结束-----------------");
        Map map = new HashMap();
        map.put("code",1);
        return map;
    }

    public int updateCar(Car car){
         return carService.updateCar(car);
    }


}
