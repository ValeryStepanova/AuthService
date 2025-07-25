package com.example.AuthService.сontroller;

import com.example.AuthService.entity.LoginRequest;
import com.example.AuthService.entity.RegisterRequest;
import com.example.AuthService.service.TokenService;
import com.example.AuthService.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class AuthController {

    private final Logger LOGGER = Logger.getLogger(AuthController.class.getName());
    private final TokenService tokenService;
    private final UserService userService;

    private final AuthenticationManager authenticationManager;
    public AuthController(TokenService tokenService, UserService userService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/token")
    public String token(@RequestBody LoginRequest loginRequest){
       Authentication authentication =  authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.username(), loginRequest.password()));
        return tokenService.generateToken(authentication);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        userService.register(registerRequest);
        return ResponseEntity.ok("User registered successfully");
    }
}
