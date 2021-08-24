package com.lucy.aitestdemo.controller;

import com.lucy.aitestdemo.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class HogwartsTestUserController {

    //@RequestMapping(value = "login", method = RequestMethod.POST)
    @PostMapping("login")
    public void login(@RequestBody UserDto userDto) {
        System.out.println("name=" + userDto.getName());
        System.out.println("pwd=" + userDto.getPwd());
    }

    @GetMapping("getById/{id}")
    public void getLogin(@PathVariable long id) {
        System.out.println("id=" + id);
    }

    @GetMapping("getById")
    public void getById(@RequestParam(value = "userId",required = false) Long userId, @RequestParam("id") Long id) {
        System.out.println("id=" + id);
    }
}
