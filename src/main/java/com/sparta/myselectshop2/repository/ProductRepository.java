package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
