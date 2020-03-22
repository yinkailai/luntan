package com.coderyin.luntan.controller;

import com.coderyin.luntan.mapper.CommentsMapper;
import com.coderyin.luntan.model.Comments;
import com.coderyin.luntan.service.CommentsService;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @RequestMapping("/comments")
    @ResponseBody
    public Map<String, Object> comments(Comments comments, HttpServletRequest request) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            commentsService.insert(comments,request);
        } catch (Exception e) {
            map.put("message","回复失败,请先登录");
            return map;
        }
        map.put("message","回复成功");
        return map;
    }
}
