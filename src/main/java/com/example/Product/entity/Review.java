package com.example.Product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Range;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;

    @Range(min = 1, max = 5, message = "Rate from 1 to 5")
    private Integer rating;

    @Column(length = 500, nullable = false)
    private String comment;

    @Column(length = 100, nullable = false)
    private String reviewerName;

    @CreationTimestamp
    @Column(name="createdAt", updatable =false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product productid;



}
