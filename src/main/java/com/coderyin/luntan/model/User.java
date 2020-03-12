package com.coderyin.luntan.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private String bio;
    private String avatarUrl;
    private Long createDate;
    private Long updateDate;




}
