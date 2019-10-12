package com.yfny.pattern.abstracts.factory.example1.concreteProduct.summer;

import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SummerButton implements Button {

    public void display() {
        System.out.println("显示浅蓝色按钮.");
    }

}
