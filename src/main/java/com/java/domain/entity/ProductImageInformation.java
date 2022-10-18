package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product_image_information")
public class ProductImageInformation {
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
    @Size(max = 5000)
    @Column(name = "image")
    private String image;

    @NotNull
    @Size(max = 255)
    @Column(name = "code_product")
    private String codeProduct;

    @NotNull
    @Size(max = 255)
    @Column(name = "code_product_detail")
    private String codeProductDetail;

    public ProductImageInformation() {
    }

    public ProductImageInformation(Long id, String code, String image, String codeProduct, String codeProductDetail) {
        this.id = id;
        this.code = code;
        this.image = image;
        this.codeProduct = codeProduct;
        this.codeProductDetail = codeProductDetail;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getCodeProductDetail() {
        return codeProductDetail;
    }

    public void setCodeProductDetail(String codeProductDetail) {
        this.codeProductDetail = codeProductDetail;
    }

    @Override
    public String toString() {
        return "ProductImageInformation{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", codeProductDetail='" + codeProductDetail + '\'' +
                '}';
    }
}
