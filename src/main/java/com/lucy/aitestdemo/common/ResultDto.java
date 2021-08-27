package com.lucy.aitestdemo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import sun.jvm.hotspot.oops.Instance;

import java.io.Serializable;

@ApiModel(value = "基础返回类", description = "基础返回类")
public class ResultDto<T> implements Serializable {

    @ApiModelProperty(value = "返回结果嘛 1 成功 0 失败", required = true, example = "1", allowableValues = "1,0")
    private Integer resultCode;

    @ApiModelProperty(value = "提示信息", example = "成功", allowableValues = "1,0")
    private String message = "";


    @ApiModelProperty(value = "响应结果数据")
    private T data = null;


    public Integer getResultCode() {
        return resultCode;
    }

    public static ResultDto newInstance() {
        return new ResultDto();
    }

    public void setAsSuccess() {
        this.resultCode = 1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ResultDto success(String message) {
        ResultDto resultDto = new ResultDto();
        resultDto.setAsSuccess();
        resultDto.setMessage(message);
        return resultDto;
    }

    public static <T> ResultDto<T> success(String message, T data) {
        ResultDto<T> resultDto = new ResultDto<>();
        resultDto.setAsSuccess();
        resultDto.setMessage(message);
        resultDto.setData(data);
        return resultDto;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
