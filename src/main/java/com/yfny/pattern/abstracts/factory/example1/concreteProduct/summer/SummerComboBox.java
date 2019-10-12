package com.yfny.pattern.abstracts.factory.example1.concreteProduct.summer;

import com.yfny.pattern.abstracts.factory.example1.abstractProduct.ComboBox;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SummerComboBox implements ComboBox {

    public void display() {
        System.out.println("显示蓝色边框组合框.");
    }

}
