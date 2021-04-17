package com.ligaofei.demo.service.impl;


import com.ligaofei.demo.domain.User;
import com.ligaofei.demo.mapper.UserMapper;
import com.ligaofei.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //声明式事务管理
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        userMapper.save(user);

        int i = 1/0;

        return 1;
    }




}
