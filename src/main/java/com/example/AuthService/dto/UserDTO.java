package com.example.AuthService.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Builder
@Getter
@Setter //???
public class UserDTO {
    private Long id;
    private String username;
    @JsonIgnore
    @JsonProperty("gfdgf")
    private String password;
    private String email;
    private String role;
}
