package com.yfny.pattern.decorator.example1.concreteDecorator;

import com.yfny.pattern.decorator.example1.component.Component;
import com.yfny.pattern.decorator.example1.decorator.ComponentDecorator;

/**
 * Created by jisongZhou on 2019/10/16.
 **/
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }

}
