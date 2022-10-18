package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product_detail")
public class ProductDetail {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @NotNull
    @Size(max = 255)
    @Column(name = "color")
    private String color;

    @NotNull
    @Size(max = 255)
    @Column(name = "price")
    private String price;

    @NotNull
    @Size(max = 10)
    @Column(name = "size")
    private String size;

    @Size(max = 255)
    @Column(name = "description")
    private String description;

    @NotNull
    @Size(max = 255)
    @Column(name = "code_product")
    private String codeProduct;

    public ProductDetail() {
    }

    public ProductDetail(Long id, String code, String color, String price, String size, String description, String codeProduct) {
        this.id = id;
        this.code = code;
        this.color = color;
        this.price = price;
        this.size = size;
        this.description = description;
        this.codeProduct = codeProduct;
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

    @Override
    public String toString() {
        return "ProductDetail{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                '}';
    }
}
