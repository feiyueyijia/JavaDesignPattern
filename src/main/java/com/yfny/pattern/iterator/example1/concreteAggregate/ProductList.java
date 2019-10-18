package com.yfny.pattern.iterator.example1.concreteAggregate;

import com.yfny.pattern.iterator.example1.aggregate.AbstractObjectList;
import com.yfny.pattern.iterator.example1.concreteIterator.ProductIterator;
import com.yfny.pattern.iterator.example1.iterator.AbstractIterator;

import java.util.List;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> products) {
        super(products);
    }

    //实现创建迭代器对象的具体工厂方法
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }

}
