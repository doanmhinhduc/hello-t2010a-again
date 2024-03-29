package com.t2010a.hellot2010aagain.entity.ShoppingCart;

import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private double price;
    private String thumbnail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int status;

    public Product() {

    }

    public Product(int id, String name, double price, String thumbnail, LocalDateTime createdAt, LocalDateTime updatedAt, int status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.thumbnail = thumbnail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
