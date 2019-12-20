package com.wang.cloud.disk.restbean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author wangpq
 * @version 1.0
 * @className RestRequest
 * @description TODO
 * @date 2019-12-01 15:22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestRequest<T> {

    @Builder.Default
    private long timeStamp = System.currentTimeMillis();

    @NotBlank(message = "请求来源不能为空！")
    private String source;

    private T data;

}
