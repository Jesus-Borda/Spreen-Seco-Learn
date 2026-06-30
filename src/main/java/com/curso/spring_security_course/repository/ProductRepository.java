package com.curso.spring_security_course.repository;

import com.curso.spring_security_course.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
