package com.coderyin.luntan.controller;

import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.mapper.UserMapper;
import com.coderyin.luntan.model.Question;
import com.coderyin.luntan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.standard.expression.Each;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;


    @GetMapping("/")
    public String index(HttpServletResponse response, HttpServletRequest request,Model model) {

        List<Question> quesList = questionMapper.findAllList();
        model.addAttribute("quesList",quesList);
        return "index";
    }

    /**
     * 退出登录
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response) {
        //清楚session
        request.getSession().removeAttribute("user");
        //清楚浏览器cookie
        Cookie cookie = new Cookie("tokeng",null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";

    }
}
