package com.java.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "category_color")
public class CategoryColor {

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
    @Size(max = 45)
    @Column(name = "code_color")
    private String codeColor;

    @NotNull
    @Size(max = 45)
    @Column(name = "description")
    private String description;

    public CategoryColor() {
    }

    public CategoryColor(Long id, String name, String codeColor, String description) {
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

    @Override
    public String toString() {
        return "CategoryColor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", codeColor='" + codeColor + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
