package com.yfny.pattern.simple.factory.example1.concreteProduct;

import com.yfny.pattern.simple.factory.example1.product.Chart;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图!");
    }

    public void display() {
        System.out.println("显示饼状图!");
    }
}
