package com.powerwisdom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerwisdom.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
