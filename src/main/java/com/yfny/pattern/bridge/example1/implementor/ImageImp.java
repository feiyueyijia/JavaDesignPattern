package com.yfny.pattern.bridge.example1.implementor;

import com.yfny.pattern.bridge.example1.Matrix;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public interface ImageImp {
    public void doPaint(Matrix m);//显示像素矩阵m
}
