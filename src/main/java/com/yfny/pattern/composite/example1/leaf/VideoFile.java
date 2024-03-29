package com.yfny.pattern.composite.example1.leaf;

import com.yfny.pattern.composite.example1.component.AbstractFile;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public class VideoFile extends AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("---- 对图像文件'" + name + "'进行杀毒");
    }
}
