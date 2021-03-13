package com.treinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
