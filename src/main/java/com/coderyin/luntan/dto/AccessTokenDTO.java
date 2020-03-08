package com.coderyin.luntan.dto;

public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String direct_uri;
    private String status;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getDirect_uri() {
        return direct_uri;
    }

    public void setDirect_uri(String direct_uri) {
        this.direct_uri = direct_uri;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
