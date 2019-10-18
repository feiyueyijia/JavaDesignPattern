package com.yfny.pattern.state.example2.concreteState;

import com.yfny.pattern.state.example2.context.Switch;
import com.yfny.pattern.state.example2.state.SwitchState;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class OnState extends SwitchState {

    public void on(Switch s) {
        System.out.println(" 已经打开！");
    }

    public void off(Switch s) {
        System.out.println(" 关闭！");
        s.setState(Switch.getState("off"));
    }
}
