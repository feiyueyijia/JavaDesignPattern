package com.yfny.pattern.factory.method.example1.concreteProduct;

import com.yfny.pattern.factory.method.example1.product.Logger;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class FileLogger implements Logger {

    public void writeLog() {
        System.out.println("文件日志记录.");
    }

}
