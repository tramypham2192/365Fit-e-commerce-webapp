package com.example.PracticeSpringDataJPA.repository;

import com.example.PracticeSpringDataJPA.entity.Product_OneToMany;
import org.springframework.data.repository.CrudRepository;

public interface Product_OneToMany_Repository extends CrudRepository<Product_OneToMany, Integer> {
}
