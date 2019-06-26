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
        Car car = new Car();
        List<Car> cars = carController.selectCar(car);
        System.out.println(cars);

    }

}
