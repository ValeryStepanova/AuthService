package com.example.AuthService.сontroller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping
    public String helloPage(Principal principal) {

        return "Hello, "+ SecurityContextHolder.getContext().getAuthentication(); //приведение типов для принсипал
    }
}
