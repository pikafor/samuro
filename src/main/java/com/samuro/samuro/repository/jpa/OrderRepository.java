package com.samuro.samuro.repository.jpa;

import com.samuro.samuro.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
