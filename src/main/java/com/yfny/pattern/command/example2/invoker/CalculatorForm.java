package com.yfny.pattern.command.example2.invoker;

import com.yfny.pattern.command.example2.command.AbstractCommand;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    //调用命令对象的 execute() 方法执行运算
    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    //调用命令对象的 undo() 方法执行撤销
    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }

}
