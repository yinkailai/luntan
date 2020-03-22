package com.coderyin.luntan.utils;

import com.coderyin.luntan.model.User;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class UserUtils {
    /**
     * 获取当前登录用户
     * @param request
     * @return
     */
    public static User getuser(HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute("user");
        if (null!=user) {
            return user;
        }
        return null;
    }
}
