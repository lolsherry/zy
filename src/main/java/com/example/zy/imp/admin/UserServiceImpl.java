package com.example.zy.imp.admin;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.zy.mapper.UserMapper;
import com.example.zy.po.User;
import com.example.zy.service.admin.UserService;

/**
 * @author 闆埄閰� Email:a@wk2.cn
 * @since 2023/03/27 07:21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User login(String username, String password) {
        User user = baseMapper.findUserByUsername(username, password);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return user;
    }

}
