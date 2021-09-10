package com.lucy.aitestdemo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ServiceException.class)
    public ResultDto serviceExceptionHandler(ServiceException se) {
        return ResultDto.fail("业务异常,系统繁忙，请稍后再试");
    }

    @ExceptionHandler(Exception.class)
    public ResultDto exceptionHandler(Exception e) {

        return ResultDto.fail("非业务异常");
    }

    @ExceptionHandler(Throwable.class)
    public ResultDto throwableHandler(Throwable th) {

        log.error(th.getMessage());
        return ResultDto.fail("系统异常");
    }

    public ResultDto resultFormat(Throwable th) {

        log.error(th.getMessage());
        String tips = "系统繁忙，请稍后重试";
        if (th instanceof ServiceException) {
            return ResultDto.fail("业务异常" + tips);
        }

        if (th instanceof Exception) {
            return ResultDto.fail("非业务异常" + tips);
        }

        return ResultDto.fail(tips);

    }
}
