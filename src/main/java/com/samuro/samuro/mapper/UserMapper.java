package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "role", ignore = true)
    UserDTO toDto(User user);

    @Mapping(target = "login", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", ignore = true)
    User toEntity(UserDTO userDTO);
}
