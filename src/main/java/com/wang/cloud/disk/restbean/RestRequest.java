package com.wang.cloud.disk.restbean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class RestRequest {

    @Builder.Default
    private long timeStamp = System.currentTimeMillis();

    private String source;

    private Object data;
}
