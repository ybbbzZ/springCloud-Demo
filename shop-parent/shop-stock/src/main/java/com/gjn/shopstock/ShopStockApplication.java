package com.gjn.shopstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopStockApplication.class, args);
    }

}
