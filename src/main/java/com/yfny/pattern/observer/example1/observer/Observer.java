package com.yfny.pattern.observer.example1.observer;

import com.yfny.pattern.observer.example1.subject.AllyControlCenter;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public interface Observer {

    public String getName();

    public void setName(String name);

    public void help();                                 //声明支援盟友方法

    public void beAttacked(AllyControlCenter acc);      //声明遭受攻击方法
}
