package com.wang.cloud.disk.exception;

import com.wang.cloud.disk.restbean.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wangpq
 * @version 1.0
 * @className ExceptionHandler
 * @description TODO
 * @date 2019-12-01 15:20
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RestResponse exception(Exception ex, HttpRequest request) {
        log.error("请求地址：{}，抛出异常信息：{}", request.getURI(),ex.getMessage());
        ex.printStackTrace();
        return RestResponse.e(-9999,"系统异常，请稍后再试！");
    }

}
