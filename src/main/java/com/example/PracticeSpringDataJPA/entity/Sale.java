package com.example.PracticeSpringDataJPA.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Sales")
public class Sale {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String description;
    @Column
    private int total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product_OneToMany product;

    public Sale(){};

    public Sale(String description, int total, Product_OneToMany product) {
        this.description = description;
        this.total = total;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getTotal() {
        return total;
    }

    public Product_OneToMany getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setProduct(Product_OneToMany product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return id == sale.id && total == sale.total && Objects.equals(description, sale.description) && Objects.equals(product, sale.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, total, product);
    }
}
