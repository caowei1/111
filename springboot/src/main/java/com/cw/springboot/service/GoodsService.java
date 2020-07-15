package com.cw.springboot.service;

import com.cw.springboot.eneity.Goods;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {
    List<Goods> findAll();

    void deleteGood(Long id);

    void update(Goods goods);

    void create(Goods goods);

    List<Goods> findByRanName(String name);


    PageInfo<Goods> findAllGoods(int pageCode, int pageSize);
}
