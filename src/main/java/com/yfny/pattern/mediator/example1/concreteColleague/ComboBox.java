package com.yfny.pattern.mediator.example1.concreteColleague;

import com.yfny.pattern.mediator.example1.colleague.Component;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class ComboBox extends Component {
    public void update() {
        System.out.println("组合框增加一项：张无忌.");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女.");
    }

}
