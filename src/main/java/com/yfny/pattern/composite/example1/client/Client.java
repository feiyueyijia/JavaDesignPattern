package com.yfny.pattern.composite.example1.client;

import com.yfny.pattern.composite.example1.component.AbstractFile;
import com.yfny.pattern.composite.example1.composite.Folder;
import com.yfny.pattern.composite.example1.leaf.ImageFile;
import com.yfny.pattern.composite.example1.leaf.TextFile;
import com.yfny.pattern.composite.example1.leaf.VideoFile;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public class Client {

    public static void main(String[] args) {
        //针对抽象构件编程
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;

        folder1 = new Folder("Sunny 的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经");
        file4 = new TextFile("葵花宝典");
        file5 = new VideoFile("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //从 "Sunny的资料" 结点开始进行杀毒操作
        folder1.killVirus();
    }

}
