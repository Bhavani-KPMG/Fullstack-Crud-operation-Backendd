package com.springboot.project.pocbackend.repository;

import com.springboot.project.pocbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
