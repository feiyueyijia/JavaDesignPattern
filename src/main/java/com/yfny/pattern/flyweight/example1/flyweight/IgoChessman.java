package com.yfny.pattern.flyweight.example1.flyweight;

import com.yfny.pattern.flyweight.example1.extend.Coordinates;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色: " + this.getColor() + ",棋子位置: " + coord.getX() + "," + coord.getY());
    }
}
