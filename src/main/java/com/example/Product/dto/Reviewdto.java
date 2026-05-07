package com.example.Product.dto;

import com.example.Product.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reviewdto {
    @Data
    public class ReviewDto {

        private Long id;
        private String comment;
        private int rating;
        private Long productId;
        private LocalDateTime createdAt;
    }


}
