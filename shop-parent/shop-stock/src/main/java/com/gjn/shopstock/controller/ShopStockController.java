package com.gjn.shopstock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/3/31
 */
@RequestMapping("/stock")
@RestController
public class ShopStockController {

    @GetMapping("/test")
    public void test(){
        System.out.println("商品库存测试");
    }


}
