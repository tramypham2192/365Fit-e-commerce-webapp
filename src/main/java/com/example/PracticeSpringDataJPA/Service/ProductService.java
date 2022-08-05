package com.example.PracticeSpringDataJPA.Service;

import com.example.PracticeSpringDataJPA.controller.dto.ProductDto;
import com.example.PracticeSpringDataJPA.entity.Product;

import java.util.List;

public interface ProductService {
//    Product save(Product product);
    Product save(Product product);
    void delete(int productId);
    List<Product> all();
    Product findById(int productId);
    Product update(Product product, int productId);
}


