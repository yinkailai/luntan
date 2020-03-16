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
    private QuestionMapper questionMapper;

    /**
     * 前往发布页面
     * @return
     */
    @GetMapping("/publishIndex")
    public String publish(Question question,Model model) {
        model.addAttribute("question",question);
        return "publish";
    }

    /**
     * 问题发布
     * @param question
     * @param model
     * @param request
     * @return
     */
    @PostMapping("/publish")
    public String save(Question question, Model model,
                        HttpServletRequest request) {
        User user =(User) request.getSession().getAttribute("user");

        if (null == user) {//如果未登录
            model.addAttribute("erro","请先登录");
            return "publish";
        }
        question.setCreator(user);
        question.setCreateDate(System.currentTimeMillis());
        question.setUpdateDate(question.getCreateDate());
        questionMapper.create(question);
        model.addAttribute("erro","发布成功");
        model.addAttribute("question",question);
        return "publish";
    }
}
