package com.gjn.shopstock.controller;

import com.gjn.shopstock.model.ShopStockEnum;
import com.gjn.shopstock.service.inter.ShopStockService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/3/31
 */
@RequestMapping("/stock")
@RestController
public class ShopStockController {

    @Autowired
    private ShopStockService shopStockService;

    @GetMapping("/sub")
    public void deduct() {
        shopStockService.deduct();
        System.out.println(ShopStockEnum.SHOP_STOCK_REDUCE_DEDUCT_ONE);
    }
}
