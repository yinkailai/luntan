package com.coderyin.luntan.provider;

import com.alibaba.fastjson.JSON;
import com.coderyin.luntan.dto.AccessTokenDTO;
import com.coderyin.luntan.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
    //调用GitHub提供的接口，获取token
    public String getToken(AccessTokenDTO accessTokenDTO) {

        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON.toJSONString(accessTokenDTO),mediaType);
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //调用GitHub提供的接口，根据token获取用户信息
    public GithubUser getuser(String token) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + token) //github接口地址
                .build();

        try (Response response = client.newCall(request).execute()) {
            //获取到user的string类型信息
            String string = response.body().string();
            //转成Githubuser类型返回回去
            return JSON.parseObject(string,GithubUser.class);
        }catch (Exception e){
            return null;
        }
    }
}
