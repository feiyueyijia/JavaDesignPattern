package com.yfny.pattern.command.example1.invoker;

import com.yfny.pattern.command.example1.command.Command;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class FunctionButton {
    private Command command;    //维持一个抽象命令对象的引用

    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //发送请求方法
    public void click() {
        System.out.print("单机功能键：");
        command.execute();
    }

}
