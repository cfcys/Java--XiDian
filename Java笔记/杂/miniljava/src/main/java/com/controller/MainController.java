package com.controller;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;

@RestController
public class MainController {
    ExpressionParser parser = new SpelExpressionParser();


    @RequestMapping("/")
    public String main(HttpServletRequest request,@RequestParam(required = false) String code,@RequestParam(required = false) String url) throws MalformedURLException {
        String requestURI = request.getRequestURI();
        if(requestURI.equals("/")){
            return "nonono";
        }
        else{
            if (code!=null) {
                String s = parser.parseExpression(code).getValue().toString();
                return s;
            } else {
                return "so?";
            }
        }
    }
}
