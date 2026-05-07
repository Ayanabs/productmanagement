package com.example.Product.dto;

import com.example.Product.entity.Product;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Productdto {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private BigDecimal price;

    private String description;

    @Column(name="createdAt", updatable =false)
    private LocalDateTime createdAt;


}
