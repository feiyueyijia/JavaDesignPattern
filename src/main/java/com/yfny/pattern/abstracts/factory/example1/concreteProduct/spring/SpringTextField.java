package com.yfny.pattern.abstracts.factory.example1.concreteProduct.spring;

import com.yfny.pattern.abstracts.factory.example1.abstractProduct.TextField;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SpringTextField implements TextField {

    public void display() {
        System.out.println("显示绿色边框文本框.");
    }

}
