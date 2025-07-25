package com.example.AuthService.entity;

import com.example.AuthService.dto.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column
    private String email;
}
