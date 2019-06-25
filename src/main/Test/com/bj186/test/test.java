package com.bj186.test;


import com.bj186.controller.CarController;
import com.bj186.pojo.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    private ApplicationContext context = null;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("springConfig.xml");
    }


    @Test
    public void tescar(){
        CarController carController = context.getBean(CarController.class);
        List<Car> cars = carController.selectCarList();
        List<Car> cars1 = carController.selectCarByPid(null);
        Car car = new Car();
        car.setCarCard("川A11111");
        int insert = carController.insert(car);
        System.out.println(insert);

    }

}
