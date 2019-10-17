package com.yfny.pattern.command.example2.concreteCommand;

import com.yfny.pattern.command.example2.command.AbstractCommand;
import com.yfny.pattern.command.example2.reveiver.Adder;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    //实现抽象命令类中声明的 execute() 方法，调用加法类的加法操作
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    //实现抽象命令类中声明的 undo() 方法，通过加一个相反数来实现加法的逆向操作
    public int undo() {
        return adder.add(-value);
    }

}
