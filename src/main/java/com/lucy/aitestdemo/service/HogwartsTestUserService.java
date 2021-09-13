package com.lucy.aitestdemo.service;

import com.lucy.aitestdemo.common.ResultDto;
import com.lucy.aitestdemo.dto.UserDto;
import com.lucy.aitestdemo.entity.AiTestUser;

public interface HogwartsTestUserService {

    public String login(UserDto userDto);

    public ResultDto<AiTestUser> save(AiTestUser aiTestUser);
}
