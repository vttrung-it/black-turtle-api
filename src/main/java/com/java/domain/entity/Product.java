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

    @NotNull
    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(max = 255)
    @Column(name = "image")
    private String image;

    @NotNull
    @Size(max = 255)
    @Column(name = "rate")
    private String rate;

    @NotNull
    @Size(max = 255)
    @Column(name = "description")
    private String description;

    public Product() {
    }

    public Product(Long id, String code, String name, String image, String rate, String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.image = image;
        this.rate = rate;
        this.description = description;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
