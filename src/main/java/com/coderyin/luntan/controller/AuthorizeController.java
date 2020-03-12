package com.coderyin.luntan.controller;

import com.coderyin.luntan.dto.AccessTokenDTO;
import com.coderyin.luntan.dto.GithubUser;
import com.coderyin.luntan.mapper.UserMapper;
import com.coderyin.luntan.model.User;
import com.coderyin.luntan.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;
    @Autowired
    private UserMapper userMapper;
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String dreUri;
    @GetMapping("/callback")
    public String authorize(@RequestParam(name="code") String code,
                            @RequestParam(name="state") String state,
                            HttpServletRequest request,
                            HttpServletResponse response) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setDirect_uri(dreUri);
        accessTokenDTO.setStatus(state);

        String token = githubProvider.getToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getuser(token);

        if (null != githubUser) {
            User user = new User();
            String tokeng = UUID.randomUUID().toString();
            user.setToken(tokeng);
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setName(githubUser.getName());
            user.setBio(githubUser.getBio());
            user.setCreateDate(System.currentTimeMillis());
            user.setUpdateDate(user.getCreateDate());
            user.setAvatarUrl(githubUser.getAvatar_url());
            userMapper.insert(user);
            response.addCookie(new Cookie("tokeng",tokeng));
            return "redirect:/";
        }
        return "index";
    }
}
