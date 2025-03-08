package com.samuro.samuro.repository.jdbc;

import com.samuro.samuro.entity.jdbc.UserEntity;

import java.util.UUID;

public interface UserJDBCRepository extends JDBCRepository<UserEntity, UUID> {
}
