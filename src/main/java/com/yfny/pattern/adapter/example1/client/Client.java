package com.yfny.pattern.adapter.example1.client;

import com.yfny.pattern.adapter.example1.target.CarController;
import com.yfny.pattern.adapter.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args){
        CarController car;
        car = (CarController) XMLUtil.getBean();
        car.move();
        car.phonate();
        car.twinkle();
    }

}
