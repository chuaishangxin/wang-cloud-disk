package com.wang.cloud.disk.server.impl;

import com.wang.cloud.disk.entity.User;
import com.wang.cloud.disk.repository.UserRepository;
import com.wang.cloud.disk.server.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangpq
 * @version 1.0
 * @className IUserServiceImpl
 * @description TODO
 * @date 2019-12-01 16:51
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String userName, String passWord) {
        User user = userRepository.findByUserName(userName);
        return user;
    }
}
