package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "category_product")
public class CategoryProduct {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 45)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @NotNull
    @Size(max = 45)
    @Column(name = "brand_name")
    private String brandName;

    @NotNull
    @Size(max = 255)
    @Column(name = "origin")
    private String origin;

    @NotNull
    @Size(max = 255)
    @Column(name = "address")
    private String address;

    @NotNull
    @Size(max = 255)
    @Column(name = "description")
    private String description;

    public CategoryProduct() {
    }

    public CategoryProduct(Long id, String name, String code, String brandName, String origin, String address, String description) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.brandName = brandName;
        this.origin = origin;
        this.address = address;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CategoryProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", brandName='" + brandName + '\'' +
                ", origin='" + origin + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
