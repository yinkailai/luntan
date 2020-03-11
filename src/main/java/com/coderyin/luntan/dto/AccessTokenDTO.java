package com.coderyin.luntan.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String direct_uri;
    private String status;


}
