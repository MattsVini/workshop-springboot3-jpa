package com.powerwisdom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerwisdom.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
