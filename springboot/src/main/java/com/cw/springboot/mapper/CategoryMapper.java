package com.cw.springboot.mapper;

import com.cw.springboot.eneity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAllCategory();
}
