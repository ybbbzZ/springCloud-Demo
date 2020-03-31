package com.gjn.shoporder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/3/31
 */
@RequestMapping("/order")
@RestController
public class ShopOrderController {

    @GetMapping("/test")
    public void test(){
        System.out.println("商品订单测试");
    }

}
