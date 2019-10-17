package com.yfny.pattern.command.example1.concreteCommand;

import com.yfny.pattern.command.example1.command.Command;
import com.yfny.pattern.command.example1.receiver.SystemExitClass;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class ExitCommand extends Command {
    private SystemExitClass seObj;  //维持对请求接收者的引用

    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        seObj.exit();
    }
}
