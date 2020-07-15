package com.cw.springboot.controller;


import com.cw.springboot.eneity.Goods;
import com.cw.springboot.service.CategoryService;
import com.cw.springboot.service.GoodsService;

import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class goodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findAll")
    public List<Goods> findAll(){

        return  goodsService.findAll();
    }

    @RequestMapping("/findAllGoods")
    public PageInfo<Goods> findAllGoods(@RequestParam(value = "pageCode")int pageCode,
                                    @RequestParam(value = "pageSize")int pageSize){
      return   goodsService.findAllGoods(pageCode, pageSize);
    }

    @RequestMapping("/findByRanName")
    public  List<Goods> findByRanName(@RequestParam(value = "name") String name){
        return  goodsService.findByRanName(name);
    }

    @RequestMapping("/delete")
    public void deleteGood(@RequestParam(value="id",required=true) Long id){
        goodsService.deleteGood(id);
    }

    @RequestMapping("/update")
    public void updateGood(@RequestBody Goods goods){

        goodsService.update(goods);
    }

    @RequestMapping("/create")
    public void createGood(@RequestBody Goods goods){


        goodsService.create(goods);
    }


}
