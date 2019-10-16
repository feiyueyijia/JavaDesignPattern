package com.yfny.pattern.composite.example1.composite;

import com.yfny.pattern.composite.example1.component.AbstractFile;

import java.util.ArrayList;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public class Folder extends AbstractFile {
    //定义集合 fileList， 用于存储 AbstractFile 类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    public void killVirus() {
        System.out.println(" **** 对文件夹'" + name + "'进行杀毒"); //模拟杀毒

        //递归调用成员构件的 killVirus() 方法
        for (Object obj : fileList) {
            ((AbstractFile) obj).killVirus();
        }
    }

}
