package com.sparta.myselectshop2.service;

import com.sparta.myselectshop2.dto.ProductRequestDto;
import com.sparta.myselectshop2.dto.ProductResponseDto;
import com.sparta.myselectshop2.entity.Product;
import com.sparta.myselectshop2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }

}
