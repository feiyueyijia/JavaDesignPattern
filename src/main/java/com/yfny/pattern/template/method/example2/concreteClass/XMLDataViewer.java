package com.yfny.pattern.template.method.example2.concreteClass;

import com.yfny.pattern.template.method.example2.abstractClass.DataViewer;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class XMLDataViewer extends DataViewer {
    //实现父类方法：获取数据
    public void getData() {
        System.out.println("从XML文件中获取数据.");
    }

    //实现父类方法：显示数据，默认以柱状图方式显示，可结合桥接模式来改进
    public void displayData() {
        System.out.println("以柱状图显示数据.");
    }

    //覆盖父类的狗子方法
    public boolean isNotXMLData() {
        return false;
    }

}
