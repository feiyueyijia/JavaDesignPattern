package com.yfny.pattern.mediator.example1.colleague;

import com.yfny.pattern.mediator.example1.mediator.Mediator;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

}
