package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.entity.User;
import com.samuro.samuro.entity.jdbc.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserJDBCMapper {
    @Mapping(target = "role", ignore = true)
    UserDTO toDto(UserEntity user);

    @Mapping(target = "login", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", ignore = true)
    UserEntity toEntity(UserDTO userDTO);
}
