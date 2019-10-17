package com.yfny.pattern.command.example2.command;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public abstract class AbstractCommand {
    public abstract int execute(int value); //声明命令执行方法 execute()
    public abstract int undo();             //声明撤销方法 undo()
}
