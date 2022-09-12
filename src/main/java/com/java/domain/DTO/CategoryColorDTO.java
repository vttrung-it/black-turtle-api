package com.java.domain.DTO;

public class CategoryColorDTO {

    private Long id;
    private String name;
    private String codeColor;
    private String description;

    public CategoryColorDTO() {
    }

    public CategoryColorDTO(Long id, String name, String codeColor, String description) {
        this.id = id;
        this.name = name;
        this.codeColor = codeColor;
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

    public String getCodeColor() {
        return codeColor;
    }

    public void setCodeColor(String codeColor) {
        this.codeColor = codeColor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
