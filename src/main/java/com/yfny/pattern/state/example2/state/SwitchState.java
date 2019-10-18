package com.yfny.pattern.state.example2.state;

import com.yfny.pattern.state.example2.context.Switch;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public abstract class SwitchState {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}
