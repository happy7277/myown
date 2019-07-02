package com.bj186.controller;

import com.bj186.pojo.Car;
import com.bj186.pojo.Park;
import com.bj186.pojo.User;
import com.bj186.service.CarService;
import com.bj186.service.ParkService;
import com.bj186.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/park")
public class ParkController {

    private ParkService parkService;
    private UserService userService;
    private CarService carService;
    @Autowired
    public ParkController(ParkService parkService, UserService userService,CarService carService) {
        this.parkService = parkService;
        this.carService =  carService;
        this.userService = userService;
    }

    @RequestMapping("/sale")
    @ResponseBody
   public void insertPark(User user,Car car){
        System.out.println("后台:park/sale------------------" );
        System.out.println("user:"+user);
        System.out.println("car:"+car);
        List<User> users = userService.selectUser(user);
        List<Car> cars = carService.selectCar(car);
        User getuser = users.get(0);
        Car getcar = cars.get(0);
        System.out.println("查出来的user:"+getuser);
        System.out.println("查出来的car:"+getcar);
        Park park = new Park();
        park.setParkUid(getuser.getUserId());
        


    }

   public int updatePark(Park record){
        return this.parkService.updatePark(record);
   }


   @RequestMapping("/parklist")
   @ResponseBody
   public void selectPark(HttpServletResponse response, HttpServletRequest request ){
        System.out.println("后台:park/parklist--------");
        Map map = new HashMap<>();
        Park park = new Park();
        List<Park> parks = parkService.selectParkList(park);
        System.out.println(parks);
        map.put("data",parks);
        map.put("msg","");
        map.put("code","");
        map.put("count",parks.size());
        response.setCharacterEncoding("utf-8");
        JSONObject json = new JSONObject(map);
        try {
            response.getWriter().write(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

   public List<Park> selectParkList(Park park){
        return this.parkService.selectParkList(park);
   }

}
