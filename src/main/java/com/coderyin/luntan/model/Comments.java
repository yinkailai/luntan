package com.coderyin.luntan.model;

public class Comments {
    private Long id;

    private Integer question;

    private String content;

    private Long parent;

    private Integer creator;

    private Long creatDate;

    private Long updateDate;

    private Long goodCount;

    private Long badCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Long getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Long creatDate) {
        this.creatDate = creatDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public Long getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Long goodCount) {
        this.goodCount = goodCount;
    }

    public Long getBadCount() {
        return badCount;
    }

    public void setBadCount(Long badCount) {
        this.badCount = badCount;
    }
}