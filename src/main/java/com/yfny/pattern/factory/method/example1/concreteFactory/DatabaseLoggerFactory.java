package com.yfny.pattern.factory.method.example1.concreteFactory;

import com.yfny.pattern.factory.method.example1.concreteProduct.DatabaseLogger;
import com.yfny.pattern.factory.method.example1.factory.LoggerFactory;
import com.yfny.pattern.factory.method.example1.product.Logger;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class DatabaseLoggerFactory implements LoggerFactory {

    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
