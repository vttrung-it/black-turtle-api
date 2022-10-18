package com.java.domain.DTO;

import java.io.Serializable;

public class ProductImageInformationDTO implements Serializable {
    private String code;
    private String image;
    private String codeProduct;
    private String codeProductDetail;

    public ProductImageInformationDTO() {
    }

    public ProductImageInformationDTO(String code, String image, String codeProduct, String codeProductDetail) {
        this.code = code;
        this.image = image;
        this.codeProduct = codeProduct;
        this.codeProductDetail = codeProductDetail;
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
}
