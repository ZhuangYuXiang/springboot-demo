package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.util.JSONFORMAT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public String querySingleUserInfo() {
        User user = this.userMapper.queryUserInfo();
        stringRedisTemplate.opsForValue().set("user", JSONFORMAT.toJsonString(user));
        System.err.print(JSONFORMAT.toJavaObject(JSONFORMAT.toJsonString(user),User.class).getName());
        return stringRedisTemplate.opsForValue().get("user");
    }
}
