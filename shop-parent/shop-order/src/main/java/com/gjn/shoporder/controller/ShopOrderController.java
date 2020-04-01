package com.gjn.shoporder.controller;

import com.gjn.shopfeign.stock.StockWebFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/3/31
 */
@RequestMapping("/order")
@RestController
public class ShopOrderController {

    @Autowired
    private StockWebFeign stockWebFeign;

    @GetMapping("/create")
    public void test() {
        stockWebFeign.deduct();
        System.out.println("订单创建成功!!");
    }


}
