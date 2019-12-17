package com.yfny.pattern.strategy.example1.concreteStrategy;

import com.yfny.pattern.strategy.example1.strategy.Discount;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class VIPDiscount implements Discount {
    private final double DISCOUNT = 0.5;

    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * DISCOUNT;
    }
}
