package com.yfny.pattern.decorator.example1.concreteComponent;

import com.yfny.pattern.decorator.example1.component.Component;

/**
 * Created by jisongZhou on 2019/10/16.
 **/
public class ListBox extends Component {

    public void display() {
        System.out.println("显示列表框！");
    }

}
