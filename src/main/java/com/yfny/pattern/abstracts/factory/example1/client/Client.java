package com.yfny.pattern.abstracts.factory.example1.client;

import com.yfny.pattern.abstracts.factory.example1.abstractFactory.SkinFactory;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.ComboBox;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.TextField;
import com.yfny.pattern.abstracts.factory.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }

}
