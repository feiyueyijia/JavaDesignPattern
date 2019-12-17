package com.yfny.pattern.strategy.example1.concreteStrategy;

import com.yfny.pattern.strategy.example1.strategy.Discount;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class ChildrenDiscount implements Discount {
    private final double DISCOUNT = 10;

    public double calculate(double price) {
        System.out.println("儿童票：");
        if (price >= 20) {
            return price - DISCOUNT;
        } else {
            return price;
        }
    }
}
