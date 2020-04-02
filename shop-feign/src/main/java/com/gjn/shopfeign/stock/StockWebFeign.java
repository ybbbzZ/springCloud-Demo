package com.gjn.shopfeign.stock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="shop-stock")
public interface StockWebFeign {
    @GetMapping("/stock/deduct")
    void deduct();
}
