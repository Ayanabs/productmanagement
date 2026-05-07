package com.example.Product.mapping;

import com.example.Product.dto.Productdto;
import com.example.Product.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapping {
    public Productdto toDto(Product entity) {
        Productdto dto = new Productdto();
        dto.setId(entity.getProduct_id());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setDescription(entity.getDescription());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }
    public Product MaptoEntity(Productdto dto) {
        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setDescription(dto.getDescription());
        return entity;
    }

}
