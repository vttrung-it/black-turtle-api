package com.java.domain.DTO;

public class CategoryProductDTO {

    private String name;
    private String code;
    private String brandName;
    private String origin;
    private String address;
    private String description;

    public CategoryProductDTO() {
    }

    public CategoryProductDTO(String name, String code, String brandName, String origin, String address, String description) {
        this.name = name;
        this.code = code;
        this.brandName = brandName;
        this.origin = origin;
        this.address = address;
        this.description = description;
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
}
