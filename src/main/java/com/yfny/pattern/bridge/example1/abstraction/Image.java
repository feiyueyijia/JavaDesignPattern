package com.yfny.pattern.bridge.example1.abstraction;

import com.yfny.pattern.bridge.example1.implementor.ImageImp;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public abstract class Image {
    protected ImageImp imp;

    //注入实现类接口对象
    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);

}
