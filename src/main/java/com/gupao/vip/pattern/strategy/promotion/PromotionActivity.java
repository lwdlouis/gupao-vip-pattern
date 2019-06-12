package com.gupao.vip.pattern.strategy.promotion;

import com.gupao.vip.pattern.strategy.promotion.impl.CouponStrategy;
import com.gupao.vip.pattern.strategy.promotion.impl.VipPromotion;
import lombok.Getter;

/**
 * 策略模式
 * 1。 策略有一个策略接口
 * 2。 各种策略实现这个接口
 * 3。 有一个环境类持有这个接口。
 * 4。 根据不同的场景，使用不同的策略（使用不同实现类）
 */
@Getter
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;


    public void executPromotion(String promotion) {

        if ("coupon".equals(promotion)) {
            promotionStrategy = new CouponStrategy();
        } else if ("vip".equals(promotion)) {
            promotionStrategy = new VipPromotion();
        }

        promotionStrategy.execute();
    }

}
