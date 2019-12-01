package com.wang.cloud.disk.server;

import com.wang.cloud.disk.entity.User;

/**
 * @author wangpq
 * @version 1.0
 * @className IUserService
 * @description TODO
 * @date 2019-12-01 16:50
 */
public interface IUserService {
    
    /**
     * 功能描述: 
     * 〈〉
     * 
     * @param userName 用户名
     * @param passWord 用户密码
     * @return : com.wang.cloud.disk.entity.User
     * @author : wangpq
     * @date : 2019-12-01 16:53
     */
    User login(String userName,String passWord);
}
