package com.yfny.pattern.adapter.example1.target;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public abstract class CarController {

    public void move() {
        System.out.println("玩具汽车移动!");
    }

    public abstract void phonate();//发出声音
    public abstract void twinkle();//灯光闪烁

}
