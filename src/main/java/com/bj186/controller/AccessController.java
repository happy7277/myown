package com.bj186.controller;

import com.bj186.pojo.Access;
import com.bj186.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccessController {

    private AccessService accessService;
    @Autowired
    public AccessController(AccessService accessService) {
        this.accessService = accessService;
    }

   public int insertAccess(Access access){
      return   this.accessService.insertAccess(access);
   }

    public int updateAccess(Access access){
        return this.accessService.updateAccess(access);
    }

    List<Access> selectAccessList(Access access){
        return this.selectAccessList(access);
    }

    List<Access> selectAccess(Access access){
        return this.selectAccess(access);
    }
}
