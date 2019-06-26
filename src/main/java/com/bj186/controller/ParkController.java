package com.bj186.controller;

import com.bj186.pojo.Park;
import com.bj186.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ParkController {

    private ParkService parkService;
    @Autowired
    public ParkController(ParkService parkService) {
        this.parkService = parkService;
    }
   public int insertPark(Park park){
        return this.parkService.insertPark(park);
   }

   public int updatePark(Park record){
        return this.parkService.updatePark(record);
   }

   public List<Park> selectPark(Park park){
        return this.parkService.selectPark(park);
   }

   public List<Park> selectParkList(Park park){
        return this.parkService.selectParkList(park);
   }

}
