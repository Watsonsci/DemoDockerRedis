package com.watson.demodocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String count(){
        Long increment = redisTemplate.opsForValue().increment("count-people");
        return increment+ " already visited this website.";

    }

}