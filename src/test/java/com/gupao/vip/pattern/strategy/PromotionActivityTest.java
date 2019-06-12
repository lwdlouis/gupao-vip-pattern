package com.gupao.vip.pattern.strategy;

import com.gupao.vip.pattern.strategy.promotion.PromotionActivity;

public class PromotionActivityTest {


    public static void main(String[] args) {

        String promotion = "vip";

        PromotionActivity activity = new PromotionActivity();

        activity.executPromotion(promotion);

    }
}
