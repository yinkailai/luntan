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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

        //发布新问题
        if (null == question.getId()) {
            question.setCreator(user);
            question.setCreateDate(System.currentTimeMillis());
            question.setUpdateDate(question.getCreateDate());
            questionMapper.create(question);
            model.addAttribute("erro","发布成功");
            model.addAttribute("question",question);
            return "publish";
        }else {
            //编辑修改问题
            question.setUpdateDate(System.currentTimeMillis());
            questionMapper.update(question);
            model.addAttribute("erro","发布成功");
            model.addAttribute("question",question);
            return "publish";
        }

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(name = "id") Integer id,Question question, Model model) {
        if (null != id) {
            question = questionMapper.findById(id);
        }
        model.addAttribute("question",question);
        return "publish";
    }
}
