package com.example.PracticeSpringDataJPA.entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;
    @Column(name="description")
    private String description;
    @Column(name="imageURL")
    private String imageURL;

    public Product(){};
    public Product(int id, String name, int price, String description, String imageURL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
