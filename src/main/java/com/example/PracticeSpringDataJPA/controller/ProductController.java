package com.example.PracticeSpringDataJPA.controller;

import com.example.PracticeSpringDataJPA.Service.ProductServiceMySQL;
import com.example.PracticeSpringDataJPA.controller.dto.ProductDto;
import com.example.PracticeSpringDataJPA.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private final ProductServiceMySQL productServiceMySQL;
    public ProductController(@Autowired ProductServiceMySQL productServiceMySQL) {
        this.productServiceMySQL = productServiceMySQL;
    }

    @GetMapping("/product/all")
    public List<Product> getProducts(){
        return productServiceMySQL.all();
    }

    @GetMapping("/find/{productId}")
    public Product getProduct(@PathVariable("productId") Integer productId)
    {
        return this.productServiceMySQL.findById(productId);
    }

    @PutMapping("/update/{productId}")
    public Product update(@RequestBody Product product, @PathVariable("productId") Integer productId){
        return this.productServiceMySQL.update(product, productId);
    }


    @GetMapping("/delete/{productId}")
    public void deleteProduct(@PathVariable("productId") Integer productId){
        this.productServiceMySQL.delete(productId);
    }



    @CrossOrigin
    @PostMapping("/product")
    public Product save(@RequestBody ProductDto productDto){
        Product newProduct = new Product();
        newProduct.setName(productDto.getName());
        newProduct.setPrice(productDto.getPrice());
        newProduct.setDescription(productDto.getDescription());
        newProduct.setImageURL(productDto.getImageUrl());
        return this.productServiceMySQL.save(newProduct);
    }
}

