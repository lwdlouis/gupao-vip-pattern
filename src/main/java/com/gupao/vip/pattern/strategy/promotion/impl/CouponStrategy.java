package com.gupao.vip.pattern.strategy.promotion.impl;

import com.gupao.vip.pattern.strategy.promotion.PromotionStrategy;

public class CouponStrategy implements PromotionStrategy {

    @Override
    public void execute() {
        System.out.println("优惠券促销。。。");
    }
}
