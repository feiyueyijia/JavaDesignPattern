package com.yfny.pattern.strategy.example1.context;

import com.yfny.pattern.strategy.example1.strategy.Discount;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class MovieTicket {
    private double price;
    private Discount discount;  //维持一个对抽象折扣类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}
