package com.yfny.pattern.command.example2.client;

import com.yfny.pattern.command.example2.command.AbstractCommand;
import com.yfny.pattern.command.example2.concreteCommand.AddCommand;
import com.yfny.pattern.command.example2.invoker.CalculatorForm;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new AddCommand();
        form.setCommand(command);       //向发送者注入命令对象

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();                    //撤销

    }
}
