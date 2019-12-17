package com.yfny.pattern.visitor.example1.visitor;

import com.yfny.pattern.visitor.example1.concreteElement.FulltimeEmployee;
import com.yfny.pattern.visitor.example1.concreteElement.ParttimeEmployee;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);
}
