package com.yfny.pattern.iterator.example1.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class IteratorDemo {

    public static void process(Collection c) {
        Iterator i = c.iterator();  //创建迭代器对象

        //通过迭代器遍历聚合对象
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }

    public static void main(String[] args) {
        Collection persons;
        persons = new ArrayList();  //创建一个 ArrayList 类型的聚合对象
        persons.add("张无忌");
        persons.add("小龙女");
        persons.add("令狐冲");
        persons.add("韦小宝");
        persons.add("袁紫衣");
        persons.add("小龙女");

        process(persons);
    }
}
