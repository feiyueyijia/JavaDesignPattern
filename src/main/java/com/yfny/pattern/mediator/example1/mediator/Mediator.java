package com.yfny.pattern.mediator.example1.mediator;

import com.yfny.pattern.mediator.example1.colleague.Component;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public abstract class Mediator {
    public abstract void componentChanged(Component c);
}
