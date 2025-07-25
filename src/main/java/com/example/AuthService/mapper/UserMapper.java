package com.example.AuthService.mapper;

import com.example.AuthService.dto.UserDTO;
import com.example.AuthService.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id")
    UserDTO toDto(User user);

    @Mapping(target = "id")
    User toEntity(UserDTO userDTO);
}
