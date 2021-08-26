package com.lucy.aitestdemo.service;

import com.lucy.aitestdemo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class HogwartsTestUserServiceImpl implements HogwartsTestUserService {

    @Override
    public String login(UserDto userDto) {
        System.out.println("name=" + userDto.getName());
        System.out.println("pwd=" + userDto.getPwd());
        return userDto.getName() + "-" + userDto.getPwd();
    }
}
