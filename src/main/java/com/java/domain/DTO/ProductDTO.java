package com.java.domain.DTO;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private String code;
    private String name;
    private String image;
    private String rate;
    private String description;
    private String codeCategoryProduct;

    public ProductDTO() {
    }

    public ProductDTO(String code, String name, String image, String rate, String description, String codeCategoryProduct) {
        this.code = code;
        this.name = name;
        this.image = image;
        this.rate = rate;
        this.description = description;
        this.codeCategoryProduct = codeCategoryProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeCategoryProduct() {
        return codeCategoryProduct;
    }

    public void setCodeCategoryProduct(String codeCategoryProduct) {
        this.codeCategoryProduct = codeCategoryProduct;
    }
}
