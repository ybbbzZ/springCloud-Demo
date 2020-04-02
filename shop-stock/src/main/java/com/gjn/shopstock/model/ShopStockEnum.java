package com.gjn.shopstock.model;

public enum ShopStockEnum {

    SHOP_STOCK_REDUCE_DEDUCT_ONE(1L, "商品库存扣减1件");

    ShopStockEnum(Long goodsId, String msg) {
        this.goodsId = goodsId;
        this.msg = msg;
    }

    private Long goodsId;
    private String msg;
}
