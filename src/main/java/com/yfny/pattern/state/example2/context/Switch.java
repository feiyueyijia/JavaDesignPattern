package com.yfny.pattern.state.example2.context;

import com.yfny.pattern.state.example2.concreteState.OffState;
import com.yfny.pattern.state.example2.concreteState.OnState;
import com.yfny.pattern.state.example2.state.SwitchState;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class Switch {
    private static SwitchState currentState, onState, offState;     //定义3个静态的状态对象
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        currentState = onState;
    }

    public void setState(SwitchState state) {
        currentState = state;
    }

    public static SwitchState getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return onState;
        } else {
            return offState;
        }
    }

    //打开开关
    public void on() {
        System.out.print(name);
        currentState.on(this);
    }

    //关闭开关
    public void off() {
        System.out.print(name);
        currentState.off(this);
    }

}
