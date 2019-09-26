package com.yfny.pattern.template.method.example1.concreteClass;

import com.yfny.pattern.template.method.example1.abstractClass.Account;

/**
 * 定期账户类：具体子类
 * Created by jisongZhou on 2019/9/26.
 **/
public class SaveAccount extends Account {
    //覆盖父类的抽象基本方法
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }

}
