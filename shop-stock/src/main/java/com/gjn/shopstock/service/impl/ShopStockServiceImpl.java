package com.gjn.shopstock.service.impl;

import com.gjn.shopstock.service.inter.ShopStockService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by gjn on 2020/3/31
 */
@Service
public class ShopStockServiceImpl implements ShopStockService {


    @Override
    @HystrixCommand(fallbackMethod = "deductError")
    public void deduct() {
        int i = 1 / 0;
        System.out.println("=========stock 8080=========");
    }

    @Override
    @HystrixCommand(fallbackMethod = "testHystrixError")
    public void testHystrix() {
        System.out.println("==testHystrix==");
    }

    public void deductError() {
        System.out.println("=========stock error 8080=========");
    }

    public void testHystrixError(){
        System.out.println("==testHystrixError==");
    }
}
