package com.coderyin.luntan.controller;

import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.mapper.UserMapper;
import com.coderyin.luntan.model.Question;
import com.coderyin.luntan.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PublishController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @GetMapping("/publishIndex")
    public String publish() {
        return "publish";
    }
    @PostMapping("/publish")
    public String save(Question question, Model model,
                        HttpServletRequest request) {
        User user = null;
        //判断是否登录状态
        Cookie[] cookies = request.getCookies();
        for (Cookie c: cookies) {
            if (c.getName().equals("tokeng")) {
                String token = c.getValue();
                user = userMapper.findByToken(token);
                if (null != user) {
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }

        if (null == user) {//如果未登录
            model.addAttribute("erro","请先登录");
            return "publish";
        }
        question.setCreator(user);
        question.setCreateDate(System.currentTimeMillis());
        question.setUpdateDate(question.getCreateDate());
        questionMapper.create(question);
        return "redirect:/";
    }
}
