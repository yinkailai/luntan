package com.coderyin.luntan.controller;

import com.coderyin.luntan.exception.ErrorCodeImp;
import com.coderyin.luntan.exception.ErrorException;
import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QusetionController {
    @Autowired
    private QuestionMapper questionMapper;

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
        questionMapper.updateIncrementRead(qid);
        model.addAttribute("question",question);
        return "question";
    }
}
