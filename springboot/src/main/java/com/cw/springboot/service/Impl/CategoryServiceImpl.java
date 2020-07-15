package com.cw.springboot.service.Impl;

import com.cw.springboot.eneity.Category;
import com.cw.springboot.mapper.CategoryMapper;
import com.cw.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAllCategory() {
        return categoryMapper.findAllCategory();
    }
}
