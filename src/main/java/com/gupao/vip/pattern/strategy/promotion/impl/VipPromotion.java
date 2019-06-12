package com.gupao.vip.pattern.strategy.promotion.impl;

import com.gupao.vip.pattern.strategy.promotion.PromotionStrategy;

public class VipPromotion implements PromotionStrategy {


    @Override
    public void execute() {
        System.out.println("vip 优惠促销。。。");
    }
}
