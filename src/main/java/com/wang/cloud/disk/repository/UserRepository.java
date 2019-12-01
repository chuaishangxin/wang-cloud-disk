package com.wang.cloud.disk.repository;

import com.wang.cloud.disk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wangpq
 * @version 1.0
 * @className UserRepository
 * @description TODO
 * @date 2019-12-01 16:45
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 功能描述:
     * 〈根据用户名查找用户信息〉
     *
     * @param userName 用户名
     * @return : com.wang.cloud.disk.entity.User
     * @author : wangpq
     * @date : 2019-12-01 16:49
     */
    User findByUserName(String userName);
}
