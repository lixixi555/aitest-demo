package com.lucy.aitestdemo.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@ApiModel(value = "用户登录类", description = "请求类")
@Data
public class UserDto {


    @ApiModelProperty(value = "测试用例的id列表",example = "12",required = true)
    private String name;
    @ApiModelProperty(value = "用户的密码",example = "12jkkh",required = true)
    private String pwd;
}
