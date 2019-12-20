package com.wang.cloud.disk.ctrl;

import com.alibaba.fastjson.JSON;
import com.wang.cloud.disk.entity.User;
import com.wang.cloud.disk.restbean.RestRequest;
import com.wang.cloud.disk.restbean.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author wangpq
 * @version 1.0
 * @className IndexController
 * @description TODO
 * @date 2019-12-01 15:17
 */
@Slf4j
@RestController
public class IndexController {

    @PostMapping("/login")
    public RestResponse login(@RequestBody @Validated RestRequest<User> request) {
        log.info(JSON.toJSONString(request));
        return RestResponse.e(request);
    }

}
