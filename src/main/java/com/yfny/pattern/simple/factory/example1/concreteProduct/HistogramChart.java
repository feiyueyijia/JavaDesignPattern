package com.yfny.pattern.simple.factory.example1.concreteProduct;

import com.yfny.pattern.simple.factory.example1.product.Chart;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图!");
    }

    public void display() {
        System.out.println("显示柱状图!");
    }
}
