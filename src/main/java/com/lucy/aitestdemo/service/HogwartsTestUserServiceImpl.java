package com.lucy.aitestdemo.service;

import com.lucy.aitestdemo.common.ResultDto;
import com.lucy.aitestdemo.dao.AiTestUserMapper;
import com.lucy.aitestdemo.dto.UserDto;
import com.lucy.aitestdemo.entity.AiTestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HogwartsTestUserServiceImpl implements HogwartsTestUserService {

    @Autowired
    private AiTestUserMapper aiTestUserMapper;

    @Override
    public String login(UserDto userDto) {
        System.out.println("name=" + userDto.getName());
        System.out.println("pwd=" + userDto.getPwd());
        return userDto.getName() + "-" + userDto.getPwd();
    }

    @Override
    public ResultDto<AiTestUser> save(AiTestUser aiTestUser) {

        aiTestUser.setCreateTime(new Date());
        aiTestUser.setUpdateTime(new Date());
        aiTestUserMapper.insertUseGeneratedKeys(aiTestUser);
        return ResultDto.success("成功", aiTestUser);
    }
}
