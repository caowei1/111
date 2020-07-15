package com.cw.springboot.service.Impl;

import com.cw.springboot.eneity.Goods;
import com.cw.springboot.mapper.GoodsMapper;
import com.cw.springboot.service.GoodsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {

         //PageHelper.startPage(1,10);
         List<Goods> list = goodsMapper.findAllGoods();
         //PageInfo pageInfo = new PageInfo(list);
        //new ThreadPoolExecutor();


        return list;
    }

    @Override
    public void deleteGood(Long id) {
        goodsMapper.deleteGood(id);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.update(goods);
    }

    @Override
    public void create(Goods goods) {
        goodsMapper.create(goods);
    }

    @Override
    public List<Goods> findByRanName(String name) {
        return goodsMapper.findByRanName(name);
    }

    @Override
    public PageInfo<Goods> findAllGoods(int pageCode, int pageSize) {
        PageHelper.startPage(pageCode,pageSize);
        List<Goods> list = goodsMapper.findAllGoods();
        PageInfo pageInfo = new PageInfo(list);;
        return pageInfo;
    }
}
