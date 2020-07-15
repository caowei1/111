package com.cw.springboot.service;

import com.cw.springboot.eneity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAllCategory();
}
