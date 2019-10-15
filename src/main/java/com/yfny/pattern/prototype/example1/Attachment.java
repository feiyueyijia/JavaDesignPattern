package com.yfny.pattern.prototype.example1;

import java.io.Serializable;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public class Attachment implements Serializable {

    private String name; //附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }

}
