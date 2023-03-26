package com.example.zy.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 登录拦截器
 *
 * @author 闆埄閰� Email:a@wk2.cn
 * @since 2023/03/27 06:24
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user"); // 假设用户登录后，将用户信息存储在session中
        if (user == null) { // 如果用户没有登录，重定向到登录页面
            response.sendRedirect("/");
            return false;
        }
        return true;
    }

    // 省略实现后两个方法
}
