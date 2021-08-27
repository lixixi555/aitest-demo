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
    public String serviceExceptionHandler(ServiceException se) {
        return "业务异常,系统繁忙，请稍后再试";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {

        return "非业务异常";
    }

    @ExceptionHandler(Throwable.class)
    public String throwableHandler(Throwable th) {

        log.error(th.getMessage());
        return "系统异常";
    }

    public String resultFormat(Throwable th) {

        log.error(th.getMessage());
        String tips = "系统繁忙，请稍后重试";
        if (th instanceof ServiceException) {
            return "业务异常" + tips;
        }

        if (th instanceof Exception) {
            return "非业务异常" + tips;
        }

        return tips;

    }
}
