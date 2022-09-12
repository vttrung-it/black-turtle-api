package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "category_link")
public class CategoryLink {

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
    @Size(max = 500)
    @Column(name = "image")
    private String image;

    @NotNull
    @Size(max = 255)
    @Column(name = "link")
    private String link;

    @NotNull
    @Size(max = 45)
    @Column(name = "description")
    private String description;

    public CategoryLink() {
    }

    public CategoryLink(Long id, String name, String image, String link, String description) {
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

    @Override
    public String toString() {
        return "CategoryLink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
