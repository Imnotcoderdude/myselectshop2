package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.entity.Product;
import com.sparta.myselectshop2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUser(User user);
}
