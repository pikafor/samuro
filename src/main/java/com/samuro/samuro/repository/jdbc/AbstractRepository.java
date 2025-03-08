package com.samuro.samuro.repository.jdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

public abstract class AbstractRepository {
    protected final NamedParameterJdbcTemplate jdbcTemplate;

    protected AbstractRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    protected void executeQuery(String sql, Map<String, Object> params) {
        jdbcTemplate.update(sql, params);
    }

    protected <T>T executForObject(String sql, Map<String, Object> params, RowMapper<T> rowMapper) {
        return jdbcTemplate.queryForObject(sql, params, rowMapper);
    }

    protected <T> List<T> executeForLit(String sql, Map<String, Object> params, RowMapper<T> rowMapper) {
        return jdbcTemplate.query(sql, params, rowMapper);
    }
}
