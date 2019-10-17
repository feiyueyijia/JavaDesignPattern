package com.yfny.pattern.command.example1.client;

import com.yfny.pattern.command.example1.command.Command;
import com.yfny.pattern.command.example1.invoker.FunctionButton;
import com.yfny.pattern.command.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command;                                //定义对象命令
        command = (Command) XMLUtil.getBean();          //读取配置文件，反射生成对象

        fb.setCommand(command);                         //将命令对象注入功能键
        fb.click();                                     //调用功能键的业务方法
    }
}
