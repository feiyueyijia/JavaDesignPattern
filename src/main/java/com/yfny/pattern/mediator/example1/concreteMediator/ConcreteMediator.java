package com.yfny.pattern.mediator.example1.concreteMediator;

import com.yfny.pattern.mediator.example1.colleague.Component;
import com.yfny.pattern.mediator.example1.concreteColleague.Button;
import com.yfny.pattern.mediator.example1.concreteColleague.ComboBox;
import com.yfny.pattern.mediator.example1.concreteColleague.List;
import com.yfny.pattern.mediator.example1.concreteColleague.TextBox;
import com.yfny.pattern.mediator.example1.mediator.Mediator;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class ConcreteMediator extends Mediator {
    //维持对各个同事对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    //封装同事对象之间的交互
    public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println(" -- 单击增加按钮 -- ");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        //从列表框选择客户
        else if (c == list) {
            System.out.println(" -- 从列表框选择客户 --");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (c == cb) {
            System.out.println(" -- 从组合框选择客户 --");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
