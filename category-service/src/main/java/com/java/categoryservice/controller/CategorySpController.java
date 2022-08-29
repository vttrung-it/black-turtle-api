package com.java.categoryservice.controller;

import com.java.categoryservice.domain.DTO.CategorySpDTO;
import com.java.categoryservice.domain.entity.CategorySp;
import com.java.categoryservice.service.CategorySpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category/")
public class CategorySpController {

    @Autowired
    private CategorySpService categorySpService;

    @GetMapping("find-all")
    public List<CategorySpDTO> getAllCategory() {
        return categorySpService.getAll();
    }
}
