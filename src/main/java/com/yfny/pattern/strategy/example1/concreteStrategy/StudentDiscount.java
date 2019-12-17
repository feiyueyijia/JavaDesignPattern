package com.yfny.pattern.strategy.example1.concreteStrategy;

import com.yfny.pattern.strategy.example1.strategy.Discount;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class StudentDiscount implements Discount {
    private final double DISCOUNT = 0.8;

    public double calculate(double price) {
        System.out.println("学生票：");
        return price * DISCOUNT;
    }
}
