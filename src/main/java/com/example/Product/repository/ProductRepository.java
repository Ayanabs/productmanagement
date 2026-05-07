package com.example.Product.repository;

import com.example.Product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


}
