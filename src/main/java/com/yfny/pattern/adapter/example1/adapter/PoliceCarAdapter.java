package com.yfny.pattern.adapter.example1.adapter;

import com.yfny.pattern.adapter.example1.adaptee.PoliceLamp;
import com.yfny.pattern.adapter.example1.adaptee.PoliceSound;
import com.yfny.pattern.adapter.example1.target.CarController;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class PoliceCarAdapter extends CarController {

    private PoliceSound sound;//定义适配者 PoliceSound 对象
    private PoliceLamp lamp;//定义适配者 PoliceLamp 对象

    public PoliceCarAdapter() {
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    //发出警笛声音
    public void phonate() {
        sound.alarmSound();//调用适配者类 PoliceSound 的方法
    }

    //呈现警灯闪烁
    public void twinkle() {
        lamp.alarmLamp();//调用适配者类 PoliceLamp 的方法
    }

}
