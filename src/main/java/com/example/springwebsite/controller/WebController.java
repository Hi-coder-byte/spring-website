package com.example.springwebsite.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {


    @RequestMapping(value = {"/", "/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String index(HttpServletRequest request) {
        request.getSession().getId();
        return "index";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String loginPage(HttpServletRequest request) {
        request.getSession().getId();
        return "login";
    }

    @RequestMapping(value = "/loginAction")
    public String loginAction(HttpServletRequest request) {
        request.getSession().getId();
        return "redirect:index";
    }
}
