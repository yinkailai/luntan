package com.coderyin.luntan.service;

import com.coderyin.luntan.mapper.UserMapper;
import com.coderyin.luntan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void  insertOrUpdate(User user) {
        User ur = userMapper.findByAccountId(user);
        if (null == ur) {
            //插入
            userMapper.insert(user);
        }else {
            //更新
            ur.setAvatarUrl(user.getAvatarUrl());
            ur.setBio(user.getBio());
            ur.setUpdateDate(System.currentTimeMillis());
            ur.setToken(user.getToken());
            ur.setName(user.getName());
            userMapper.update(ur);
        }
    };
}
