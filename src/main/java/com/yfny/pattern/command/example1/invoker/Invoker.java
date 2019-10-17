package com.yfny.pattern.command.example1.invoker;

import com.yfny.pattern.command.example1.extend.CommandQueue;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Invoker {
    private CommandQueue commandQueue;  //维持一个 CommandQueue 对象的引用

    //构造注入
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //调用 CommandQueue 类的 execute() 方法
    public void call() {
        commandQueue.execute();
    }

}
