package com.yfny.pattern.simple.factory.example1.concreteProduct;

import com.yfny.pattern.simple.factory.example1.product.Chart;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图!");
    }

    public void display() {
        System.out.println("显示折线图!");
    }
}
