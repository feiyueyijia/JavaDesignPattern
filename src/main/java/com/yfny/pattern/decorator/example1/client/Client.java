package com.yfny.pattern.decorator.example1.client;

import com.yfny.pattern.decorator.example1.component.Component;
import com.yfny.pattern.decorator.example1.concreteComponent.Window;
import com.yfny.pattern.decorator.example1.concreteDecorator.BlackBorderDecorator;
import com.yfny.pattern.decorator.example1.concreteDecorator.ScrollBarDecorator;

/**
 * Created by jisongZhou on 2019/10/16.
 **/
public class Client {
    public static void main(String[] args) {
        Component component, componentSB, componentBB;      //使用抽象构件定义对象
        component = new Window();                           //创建具体构件对象
        componentSB = new ScrollBarDecorator(component);    //创建装饰后的构建对象
        componentBB = new BlackBorderDecorator(componentSB);//将装饰了一次的对象注入另一个装饰类，进行第二次装饰
        componentBB.display();
    }
}
