package com.coderyin.luntan.controller;

import com.coderyin.luntan.dto.AccessTokenDTO;
import com.coderyin.luntan.dto.GithubUser;
import com.coderyin.luntan.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("github.redirect.uri}")
    private String dreUri;
    @GetMapping("/callback")
    public String authorize(@RequestParam(name="code") String code,
                            @RequestParam(name="state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setDirect_uri(dreUri);
        accessTokenDTO.setStatus(state);

        String token = githubProvider.getToken(accessTokenDTO);
        GithubUser user = githubProvider.getuser(token);
        return "index";
    }
}
