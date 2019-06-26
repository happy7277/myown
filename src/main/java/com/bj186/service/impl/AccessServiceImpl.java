package com.bj186.service.impl;

import com.bj186.mapper.AccessMapper;
import com.bj186.pojo.Access;
import com.bj186.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccessService")
public class AccessServiceImpl implements AccessService {

    private AccessMapper accessMapper;

    @Autowired
    public AccessServiceImpl(AccessMapper accessMapper){
        this.accessMapper = accessMapper;
    }


    @Override
    public int insertAccess(Access access) {
        return this.accessMapper.insertAccess(access);
    }

    @Override
    public int updateAccess(Access access) {
        return this.accessMapper.updateAccess(access);
    }

    @Override
    public List<Access> selectAccessList(Access access) {
        return this.accessMapper.selectAccessList(access);
    }

    @Override
    public List<Access> selectAccess(Access access) {
        return this.accessMapper.selectAccess(access);
    }
}
