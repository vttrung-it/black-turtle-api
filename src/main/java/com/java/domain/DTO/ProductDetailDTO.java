package com.java.domain.DTO;

import java.io.Serializable;

public class ProductDetailDTO implements Serializable {
    private String code;
    private String color;
    private String price;
    private String size;
    private String description;
    private String codeProduct;

    public ProductDetailDTO() {
    }

    public ProductDetailDTO(String code, String color, String price, String size, String description, String codeProduct) {
        this.code = code;
        this.color = color;
        this.price = price;
        this.size = size;
        this.description = description;
        this.codeProduct = codeProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }
}
