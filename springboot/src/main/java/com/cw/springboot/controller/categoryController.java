package com.cw.springboot.controller;

import com.cw.springboot.eneity.Category;
import com.cw.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class categoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAllCategory")
    public List<Category> findAllCategory(){
        return categoryService.findAllCategory();
    }
}
