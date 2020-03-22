package com.coderyin.luntan.controller;

import com.coderyin.luntan.exception.ErrorCodeImp;
import com.coderyin.luntan.exception.ErrorException;
import com.coderyin.luntan.mapper.CommentsMapper;
import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.model.Comments;
import com.coderyin.luntan.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QusetionController {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private CommentsMapper commentsMapper;

    /**
     * 查看问题
     * @param qid
     * @param model
     * @return
     */
    @GetMapping("/question/{qid}")
    public String toQuestion(@PathVariable(name = "qid") Integer qid, Model model) {
        Question question = questionMapper.findById(qid);
        if (null == question){
            throw new ErrorException(ErrorCodeImp.OBJECT_NOT_FOUND);
        }
        //刷新浏览数
        questionMapper.updateIncrementRead(qid);
        //回复数
        List<Comments> comments = commentsMapper.selectByQuestionId(qid);
        model.addAttribute("question",question);
        model.addAttribute("comments",comments);
        return "question";
    }
}
