package com.yfny.pattern.state.example3.client;

import com.yfny.pattern.state.example3.context.Screen;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class Client {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
