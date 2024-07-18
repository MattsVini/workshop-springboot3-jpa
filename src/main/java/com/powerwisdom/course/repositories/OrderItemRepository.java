package com.powerwisdom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerwisdom.course.entities.OrderItem;
import com.powerwisdom.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
