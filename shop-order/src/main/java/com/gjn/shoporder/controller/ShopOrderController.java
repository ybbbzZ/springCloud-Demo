package com.gjn.shoporder.controller;

import com.gjn.shopfeign.stock.StockWebFeign;
import com.gjn.shoporder.config.ShopOrderConfig;
import com.gjn.shoporder.config.entity.UserInfo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/3/31
 */
@RequestMapping("/order")
@RestController
@RefreshScope
public class ShopOrderController {

    @Autowired
    private StockWebFeign stockWebFeign;

    @Autowired
    private ShopOrderConfig config;

    @GetMapping("/create")
    public void test() {
        stockWebFeign.deduct();
        System.out.println("订单创建成功!!");
    }

    @GetMapping("/index")
    public String index(@RequestParam(required = false) String token){
        return token;
    }

    @GetMapping("/config")
    public ShopOrderConfig getConfig(){
        return config;
    }
}
