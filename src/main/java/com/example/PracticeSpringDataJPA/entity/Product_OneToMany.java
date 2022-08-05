package com.example.PracticeSpringDataJPA.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="products")
public class Product_OneToMany implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private int price;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Set<Sale> sales;

    public Product_OneToMany(){}
    public Product_OneToMany(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_OneToMany product = (Product_OneToMany) o;
        return id == product.id && price == product.price && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(sales, product.sales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, sales);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id" +
                "=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }
}
