package com.github.yagoalmeida.productservice.repository;

import com.github.yagoalmeida.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}