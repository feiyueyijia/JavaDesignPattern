package com.yfny.pattern.state.example3.concreteState;

import com.yfny.pattern.state.example3.state.ScreenState;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class LargestState extends ScreenState {

    public void display() {
        System.out.println("四倍大小！");
    }
}
