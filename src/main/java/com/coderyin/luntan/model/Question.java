package com.coderyin.luntan.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String content;
    private String tag;
    private User creator;
    private Integer comments;
    private Integer readCount;
    private Integer goodCount;
    private Long createDate;
    private Long updateDate;


}
