package com.coderyin.luntan.advice;

import com.coderyin.luntan.exception.ErrorException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e, Model model) {
        if (e instanceof ErrorException) {
            model.addAttribute("message",e.getMessage());
        }else {
            model.addAttribute("message","服务器炸了");
        }

        return new ModelAndView("error");
    }
}
