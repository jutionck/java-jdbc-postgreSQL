package com.enigma.mandiri.jdbc.model;

import java.time.LocalDateTime;

public class Product {

    private String id;
    private String productName;
    private Integer productBuyPrice;
    private Integer productSellPrice;
    private String productImage;
    private Integer productStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product() {}

    public Product(String id, String productName, Integer productBuyPrice, Integer productSellPrice, String productImage, Integer productStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.productName = productName;
        this.productBuyPrice = productBuyPrice;
        this.productSellPrice = productSellPrice;
        this.productImage = productImage;
        this.productStatus = productStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductBuyPrice() {
        return productBuyPrice;
    }

    public void setProductBuyPrice(Integer productBuyPrice) {
        this.productBuyPrice = productBuyPrice;
    }

    public Integer getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(Integer productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
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

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", productBuyPrice=" + productBuyPrice +
                ", productSellPrice=" + productSellPrice +
                ", productImage='" + productImage + '\'' +
                ", productStatus=" + productStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
