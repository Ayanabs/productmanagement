package com.example.Product.service;

import com.example.Product.dto.Productdto;
import com.example.Product.entity.Product;
import com.example.Product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Productdto createProduct(Productdto dto);
    Productdto updateProduct(Productdto dto);
    Productdto getProductById(Long id);
    List<Productdto> getAllProducts();
    void deleteProductById(Long id);
}
