package com.example.zy.service.admin;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.zy.po.User;

/**
 * @author 闆埄閰� Email:a@wk2.cn
 * @since 2023/03/27 07:22
 */

public interface UserService extends IService<User> {

    public User login(String username, String password);

}
