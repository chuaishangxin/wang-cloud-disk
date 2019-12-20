package com.wang.cloud.disk.advice;

import com.wang.cloud.disk.restbean.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangpq
 * @version 1.0
 * @className ExceptionHandler
 * @description TODO
 * @date 2019-12-01 15:20
 */
@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public RestResponse exception(Exception ex, HttpServletRequest request) {
        log.error("请求地址：{}，异常信息：{}", request.getRequestURI(), ex.getMessage());
        ex.printStackTrace();
        return RestResponse.e(-9999, "系统异常，请稍后再试！");
    }

    @ExceptionHandler(BindException.class)
    public RestResponse handleBindException(BindException e, HttpServletRequest request) {
        log.error("参数效验异常信息，请求地址：[{}]", request.getRequestURI(), e.getMessage());
        return RestResponse.e(-9999, e.getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public RestResponse businessException(HttpServletRequest request) {
        log.error("缺少请求参数异常，请求地址：[{}]", request.getRequestURI());
        return RestResponse.e(-9999, "缺少请求参数");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public RestResponse handleNotSupportedException(HttpServletRequest request) {
        log.error("请求方式异常，请求地址:[{}]", request.getRequestURI());
        return RestResponse.e(-9999, "请求方式错误");
    }
}
