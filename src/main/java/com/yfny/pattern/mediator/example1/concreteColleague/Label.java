package com.yfny.pattern.mediator.example1.concreteColleague;

import com.yfny.pattern.mediator.example1.colleague.Component;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class Label extends Component {
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1.");
    }
}
