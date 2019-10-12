package com.yfny.pattern.factory.method.example1.client;

import com.yfny.pattern.factory.method.example1.factory.LoggerFactory;
import com.yfny.pattern.factory.method.example1.product.Logger;
import com.yfny.pattern.factory.method.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/30.
 **/
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
