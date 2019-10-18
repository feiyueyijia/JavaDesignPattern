package com.yfny.pattern.iterator.example1.aggregate;

import com.yfny.pattern.iterator.example1.iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}
