package com.yfny.pattern.bridge.example1.refinedAbstraction;

import com.yfny.pattern.bridge.example1.Matrix;
import com.yfny.pattern.bridge.example1.abstraction.Image;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class PNGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析 PNG 文件并获得一个像素矩阵对象 m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式为PNG.");
    }
}
