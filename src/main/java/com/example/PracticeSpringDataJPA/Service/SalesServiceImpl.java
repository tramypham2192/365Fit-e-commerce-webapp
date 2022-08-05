package com.example.PracticeSpringDataJPA.Service;

import com.example.PracticeSpringDataJPA.entity.Sale;
import com.example.PracticeSpringDataJPA.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalesServiceImpl implements SalesService {
    private final SaleRepository salesRepository;

    public SalesServiceImpl(SaleRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public Sale getSale(int id) {
        Optional<Sale> sale = salesRepository.findById(id);
        return sale.orElse(null);
    }
}
