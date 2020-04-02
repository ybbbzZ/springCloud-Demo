package com.gjn.shopstock.controller.feign;

import com.gjn.shopfeign.stock.StockWebFeign;
import com.gjn.shopstock.service.inter.ShopStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjn on 2020/4/1
 */
@RestController
public class StockWebFeignController implements StockWebFeign {
    @Autowired
    ShopStockService shopStockService;

    @Override
    public void deduct() {
        shopStockService.deduct();
    }

}
