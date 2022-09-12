package com.java.domain.DTO;

public class CategoryLinkDTO {

    private Long id;
    private String name;
    private String image;
    private String link;
    private String description;

    public CategoryLinkDTO() {
    }

    public CategoryLinkDTO(Long id, String name, String image, String link, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.link = link;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
