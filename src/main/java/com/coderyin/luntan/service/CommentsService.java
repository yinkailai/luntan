package com.coderyin.luntan.service;

import com.coderyin.luntan.mapper.CommentsMapper;
import com.coderyin.luntan.mapper.QuestionMapper;
import com.coderyin.luntan.model.Comments;
import com.coderyin.luntan.model.User;
import com.coderyin.luntan.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

@Service
public class CommentsService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private QuestionMapper questionMapper;

    @Transactional
    public void insert(Comments comments, HttpServletRequest request) {
        comments.setCreatDate(System.currentTimeMillis());
        comments.setUpdateDate(comments.getCreatDate());
        //获取当前登录用户
        User user = UserUtils.getuser(request);
        if (null!=user && null!=user.getId()) {
            comments.setCreator(user.getId());
        }
        commentsMapper.insert(comments);
        questionMapper.updateIncrementComments(comments.getQuestion());
    }
}
