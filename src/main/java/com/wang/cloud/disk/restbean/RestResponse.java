package com.wang.cloud.disk.restbean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangpq
 * @version 1.0
 * @className RestResponse
 * @description TODO
 * @date 2019-12-01 15:22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestResponse {

    private int code;

    @Builder.Default
    private String msg = "成功";

    private Object data;

    @Builder.Default
    private long timeStamp = System.currentTimeMillis();

    public static RestResponse e(){
        return RestResponse.builder().build();
    }

    public static RestResponse e(Object data){
        return RestResponse.builder().data(data).build();
    }

    public static RestResponse e(int code,String msg){
        return e(code,msg,null);
    }

    public static RestResponse e(int code,String msg,Object data){
        return RestResponse.builder().code(code).msg(msg).data(data).build();
    }

    public static RestResponse e(int code,Object data){
        return RestResponse.builder().code(code).data(data).build();
    }
}
