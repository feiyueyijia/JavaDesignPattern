package com.yfny.pattern.bridge.example1.client;

import com.yfny.pattern.bridge.example1.abstraction.Image;
import com.yfny.pattern.bridge.example1.implementor.ImageImp;
import com.yfny.pattern.bridge.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }

}
