package com.yfny.pattern.interpreter.example1.client;

import com.yfny.pattern.interpreter.example1.extend.InstructionHandler;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);

        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
