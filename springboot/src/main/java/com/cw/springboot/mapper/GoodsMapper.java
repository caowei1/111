package com.cw.springboot.mapper;

import com.cw.springboot.eneity.Goods;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {
     List<Goods> findAllGoods();

    void deleteGood(Long id);

    void update(Goods goods);

    void create(Goods goods);

    List<Goods> findByRanName(String name);
}
