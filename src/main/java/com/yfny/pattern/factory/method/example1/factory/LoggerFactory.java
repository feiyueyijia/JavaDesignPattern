package com.yfny.pattern.factory.method.example1.factory;

import com.yfny.pattern.factory.method.example1.product.Logger;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public interface LoggerFactory {

    public Logger createLogger();//抽象工厂方法

}
