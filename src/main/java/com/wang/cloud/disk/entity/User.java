package com.wang.cloud.disk.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wangpq
 * @version 1.0
 * @className User
 * @description TODO
 * @date 2019-12-01 15:01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cloud_user")
public class User {

    /**
     *  用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",length = 32)
    private Long id;

    /**
     *  用户名
     */
    @Column(name = "user_name",length = 30)
    private String userName;

    /**
     *  用户密码
     */
    @Column(name = "pass_word",length = 30)
    private String passWord;

    /**
     *  创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
}
