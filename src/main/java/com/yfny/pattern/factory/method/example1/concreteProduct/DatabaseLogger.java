package com.yfny.pattern.factory.method.example1.concreteProduct;

import com.yfny.pattern.factory.method.example1.product.Logger;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class DatabaseLogger implements Logger {

    public void writeLog() {
        System.out.println("数据库日志记录.");
    }

}
