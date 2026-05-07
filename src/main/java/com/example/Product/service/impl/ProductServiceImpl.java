package com.example.Product.service.impl;

import com.example.Product.dto.Productdto;
import com.example.Product.entity.Product;
import com.example.Product.mapping.ProductMapping;
import com.example.Product.repository.ProductRepository;
import com.example.Product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapping productMapping;




    @Override
    public Productdto createProduct(Productdto dto) {
        // 1. Use the mapper to convert DTO -> Entity
        Product entity = productMapping.MaptoEntity(dto);

        // 2. Save the entity
        Product savedProduct = productRepository.save(entity);

        // 3. Use the mapper to convert Entity -> DTO and return it
        return productMapping.toDto(savedProduct);
    }

    @Override
    public Productdto updateProduct(Productdto dto) {
        Product updateProduct = new Product();
        productRepository.findById(dto.getId())
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + dto.getId()));


        updateProduct.setName(dto.getName());
        updateProduct.setPrice(dto.getPrice());
        updateProduct.setDescription(dto.getDescription());
        return productMapping.toDto(updateProduct);
    }




    @Override
    public Productdto getProductById(Long id) {

            Product product = productRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Not found"));
        return productMapping.toDto(product);
    }

    @Override
    public List<Productdto> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(productMapping::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);

    }

}

