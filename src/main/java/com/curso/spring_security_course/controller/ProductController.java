package com.curso.spring_security_course.controller;

import com.curso.spring_security_course.entity.Product;
import com.curso.spring_security_course.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produts")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = productRepository.findAll();
        if (products != null && !products.isEmpty()){
            return ResponseEntity.ok(products);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public  ResponseEntity<Product> createOne (@RequestBody @Valid   Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                productRepository.save(product)
        );
    }
}


