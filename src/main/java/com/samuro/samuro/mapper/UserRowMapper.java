package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.dto.enums.UserRole;
import com.samuro.samuro.entity.jdbc.UserEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UserRowMapper implements RowMapper<UserEntity> {
    @Override
    public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserEntity user = new UserEntity();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setNickname(rs.getString("nickname"));
        user.setPhoto(rs.getString("photo"));
        user.setRole(rs.getString("role"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
