package com.yfny.pattern.decorator.example1.decorator;

import com.yfny.pattern.decorator.example1.component.Component;

/**
 * Created by jisongZhou on 2019/10/16.
 **/
public class ComponentDecorator extends Component {
    private Component component; //维持对抽象构件类型对象的引用

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }

}
