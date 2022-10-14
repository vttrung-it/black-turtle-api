package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Size(max = 255)
    @Column(name = "image")
    private String image;

    @Size(max = 255)
    @Column(name = "rate")
    private String rate;

    @Size(max = 255)
    @Column(name = "description")
    private String description;

    @NotNull
    @Size(max = 255)
    @Column(name = "code_category_product")
    private String codeCategoryProduct;

    public Product() {
    }

    public Product(Long id, String code, String name, String image, String rate, String description, String codeCategoryProduct) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.image = image;
        this.rate = rate;
        this.description = description;
        this.codeCategoryProduct = codeCategoryProduct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", codeCategoryProduct='" + codeCategoryProduct + '\'' +
                '}';
    }
}
