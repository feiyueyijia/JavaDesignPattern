package com.yfny.pattern.proxy.example1.extend;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Logger {
    // 模拟实现日志记录
    public void log(String userId) {
        System.out.println("更新数据库，用户'" + userId + "'查询次数加1！");
    }
}
