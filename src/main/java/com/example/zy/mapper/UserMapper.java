package com.example.zy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.zy.po.User;

/**
 * @author 闆埄閰� Email:a@wk2.cn
 * @since 2023/03/27 07:19
 */

public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户信息
     * 
     * @param username 用户名
     * @return 用户信息
     */
    User findUserByUsername(String username, String password);
}
