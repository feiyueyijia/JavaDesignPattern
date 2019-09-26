package com.yfny.pattern.template.method.example2.client;

import com.yfny.pattern.template.method.example2.abstractClass.DataViewer;
import com.yfny.pattern.template.method.example2.concreteClass.XMLDataViewer;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args) {
        DataViewer dv;
        dv = new XMLDataViewer();
        dv.process();
    }

}
