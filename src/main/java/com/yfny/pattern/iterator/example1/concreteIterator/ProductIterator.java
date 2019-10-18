package com.yfny.pattern.iterator.example1.concreteIterator;

import com.yfny.pattern.iterator.example1.concreteAggregate.ProductList;
import com.yfny.pattern.iterator.example1.iterator.AbstractIterator;

import java.util.List;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class ProductIterator implements AbstractIterator {

    private List<Object> products;
    private int cursor1;                    //定义一个游标，用于记录正向遍历的位置
    private int cursor2;                    //定义一个游标，用于记录逆向遍历的位置

    public ProductIterator(ProductList list) {
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    public boolean isLast() {
        return (cursor1 == products.size());
    }

    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    public boolean isFirst() {
        return (cursor2 == -1);
    }

    public Object getNextItem() {
        return products.get(cursor1);
    }

    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
