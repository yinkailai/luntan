package com.coderyin.luntan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommentsController {
    @RequestMapping("/comments")
    @ResponseBody
    public String comments(HttpServletRequest request) {
        String id = request.getParameter("question");
        return "";
    }
}
