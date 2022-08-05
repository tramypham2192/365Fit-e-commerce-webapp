package com.example.PracticeSpringDataJPA.repository;

import com.example.PracticeSpringDataJPA.controller.dto.ProductDto;
import com.example.PracticeSpringDataJPA.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
