package com.curso.spring_security_course.repository;

import com.curso.spring_security_course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
