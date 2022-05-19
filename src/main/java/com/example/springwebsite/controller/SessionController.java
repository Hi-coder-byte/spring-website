package com.example.springwebsite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@RestController
public class SessionController {

    @RequestMapping("/sessionid")
    public String sessionId(HttpServletRequest request) throws UnknownHostException {
        return "Server Port: " + request.getServerPort() + " session: " +request.getSession().getId() + " Domain: " + InetAddress.getLocalHost().getHostName();
    }
}
