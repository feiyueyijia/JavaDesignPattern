package com.yfny.pattern.command.example1.extend;

import com.yfny.pattern.command.example1.command.Command;

import java.util.ArrayList;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class CommandQueue {
    //定义一个 ArrayList 来存储命令队列
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的 execute() 方法
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }

}
