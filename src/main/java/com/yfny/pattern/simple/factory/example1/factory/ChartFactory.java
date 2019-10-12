package com.yfny.pattern.simple.factory.example1.factory;

import com.yfny.pattern.simple.factory.example1.concreteProduct.HistogramChart;
import com.yfny.pattern.simple.factory.example1.product.Chart;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图!");
        }else if (type.equalsIgnoreCase("pie")) {
            chart = new HistogramChart();
            System.out.println("初始化设置饼状图!");
        }else if (type.equalsIgnoreCase("line")) {
            chart = new HistogramChart();
            System.out.println("初始化设置折线图!");
        }
        return chart;
    }
}
