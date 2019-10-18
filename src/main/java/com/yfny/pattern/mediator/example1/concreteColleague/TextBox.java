package com.yfny.pattern.mediator.example1.concreteColleague;

import com.yfny.pattern.mediator.example1.colleague.Component;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class TextBox extends Component {
    public void update() {
        System.out.println("客户信息增加成功后文本框清空.");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女.");
    }

}
