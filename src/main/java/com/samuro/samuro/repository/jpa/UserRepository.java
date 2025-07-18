package com.samuro.samuro.repository.jpa;

import com.samuro.samuro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
