package com.powerwisdom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerwisdom.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
