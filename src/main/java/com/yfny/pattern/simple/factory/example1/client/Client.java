package com.yfny.pattern.simple.factory.example1.client;

import com.yfny.pattern.simple.factory.example1.factory.ChartFactory;
import com.yfny.pattern.simple.factory.example1.product.Chart;
import com.yfny.pattern.simple.factory.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class Client {

    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }

}
