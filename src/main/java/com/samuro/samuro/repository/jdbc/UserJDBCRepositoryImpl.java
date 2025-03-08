package com.samuro.samuro.repository.jdbc;

import com.samuro.samuro.entity.jdbc.UserEntity;
import com.samuro.samuro.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class UserJDBCRepositoryImpl extends AbstractRepository implements UserJDBCRepository {
    @Autowired
    public UserJDBCRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public UserEntity update(UserEntity entity) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", entity.getId());
        params.put("login", entity.getLogin());
        params.put("password", entity.getPassword());
        params.put("photo", entity.getPhoto());
        params.put("nickname", entity.getNickname());
        params.put("role", entity.getNickname());
        return executForObject("UPDATE users SET id = :id," +
                "SET login = :login" +
                "SET password = :password" +
                "SET photo = :photo" +
                "SET nickname = :nickname" +
                "SET role = :role", params, new UserRowMapper());
    }

    @Override
    public void deleteById(UUID id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        executeQuery("DELETE FROM users WHERE id = :id", params);
    }

    public UserEntity findById(UUID id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return executForObject("SELECT * FROM users WHERE id = :id", params,new UserRowMapper());
    }

    public UserEntity save(UserEntity user) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", UUID.randomUUID());
        params.put("role", user.getRole());
        params.put("nickname", user.getNickname());
        params.put("photo", user.getPhoto());
        params.put("login", user.getLogin());
        params.put("password", user.getPassword());
        return  executForObject("WITH insert_return AS (" +
                "INSERT INTO users (id, role, nickname, photo, login, password)" +
                "VALUES (:id, :role, :nickname, :photo, :login, :password)" +
                "RETURNING *)" +
                "SELECT * FROM insert_return", params, new UserRowMapper());
    }
}
