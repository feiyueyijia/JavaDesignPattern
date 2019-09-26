package com.yfny.pattern.bridge.example1.concreteInplementor;

import com.yfny.pattern.bridge.example1.Matrix;
import com.yfny.pattern.bridge.example1.implementor.ImageImp;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用 Windows 系统的绘制函数绘制像素矩阵
        System.out.print("在 Windows 操作系统中显示图像：");
    }
}
