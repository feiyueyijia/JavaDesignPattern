package com.yfny.pattern.visitor.example1.element;

import com.yfny.pattern.visitor.example1.visitor.Department;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public interface Employee {
    public void accept(Department handler); //接受一个抽象访问者访问
}
