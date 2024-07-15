package com.powerwisdom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerwisdom.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
