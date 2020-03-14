package com.coderyin.luntan.controller;

import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.mapper.UserMapper;
import com.coderyin.luntan.model.Question;
import com.coderyin.luntan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action, Model model, HttpServletRequest request) {
        User user =(User) request.getSession().getAttribute("user");
        //若未登录，用户为空，则跳回首页
        if (user == null) {
            return "redirect:/";
        }

        if("question".equals(action)) {
            model.addAttribute("section","question");
            model.addAttribute("sectionName","我的问题");
        }
        if("answer".equals(action)) {
            model.addAttribute("section","answer");
            model.addAttribute("sectionName","最新回复");
        }
        List<Question> quesList = questionMapper.findListByUser(user);
        model.addAttribute("quesList",quesList);
        return "profile";
    }
}
