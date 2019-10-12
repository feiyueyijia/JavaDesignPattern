package com.yfny.pattern.abstracts.factory.example1.concreteProduct.spring;

import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SpringButton implements Button {

    public void display() {
        System.out.println("显示浅绿色按钮.");
    }

}
