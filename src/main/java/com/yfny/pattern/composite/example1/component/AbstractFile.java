package com.yfny.pattern.composite.example1.component;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}
