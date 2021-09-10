package com.lucy.aitestdemo.dto;

import com.lucy.aitestdemo.entity.BaseEntityNew;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@ApiModel(value = "用户注册类",description = "请求类")
@Data
public class AddAiTestUserDto extends BaseEntityNew {

    @ApiModelProperty(value = "用户名",example = "lucy",required = true)
    private String userName;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码",example = "123456",required = true)
    private String password;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱",example = "lll@sina.com")
    private String email;

    @ApiModelProperty(value = "自动生成用例job名称",example = "hhkhkhkg")
    private String autoCreateCaseJobName;


    @ApiModelProperty(value = "执行测试job名称",example = "hhkhkhkg")
    private String startTestJobName;


    @ApiModelProperty(value = "默认jenkins服务器",example = "hhkhkhkg")
    private Integer defaultJekinsId2;

}