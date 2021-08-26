package com.lucy.aitestdemo.controller;

import com.lucy.aitestdemo.dto.UserDto;
import com.lucy.aitestdemo.service.HogwartsTestUserService;
import com.lucy.aitestdemo.service.HogwartsTestUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags="lucy test 一下下")
@RestController
@RequestMapping("test")
public class HogwartsTestUserController {


    @Autowired
    private HogwartsTestUserService hogwartsTestUserService;

    @Value("${hogwarts.key1}")
    private String hogwartskey1;

    @ApiOperation("登录接口")
    //@RequestMapping(value = "login", method = RequestMethod.POST)
    @PostMapping("login")
    public void login(@RequestBody UserDto userDto) {
        hogwartsTestUserService.login(userDto);
        System.out.println("hogwartskey1=" + hogwartskey1);
    }

    @GetMapping("getById/{id}")
    public void getLogin(@PathVariable long id) {
        System.out.println("id=" + id);
    }

    @GetMapping("getById")
    public void getById(@RequestParam(value = "userId", required = false) Long userId, @RequestParam("id") Long id) {
        System.out.println("id=" + id);
    }
}
