package com.lucy.aitestdemo.dao;

import com.lucy.aitestdemo.common.MySqlExtensionMapper;
import com.lucy.aitestdemo.entity.AiTestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AiTestUserMapper extends MySqlExtensionMapper<AiTestUser> {

    AiTestUser selectAiTestUser(@Param("id") Integer id);
}