package com.example.AuthService.entity;

public record RegisterRequest(String username, String password, String email, String role) {
}
