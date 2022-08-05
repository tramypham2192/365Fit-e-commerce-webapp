package com.example.PracticeSpringDataJPA.repository;

import com.example.PracticeSpringDataJPA.entity.Sale;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleRepository extends CrudRepository <Sale, Integer> {
}
