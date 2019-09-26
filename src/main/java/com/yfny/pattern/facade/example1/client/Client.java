package com.yfny.pattern.facade.example1.client;

import com.yfny.pattern.facade.example1.facade.AbstractEncryptFacade;
import com.yfny.pattern.facade.example1.facade.EncryptFacade;
import com.yfny.pattern.facade.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args) {
        //run1();
        run2();
    }

    private static void run1() {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src//main//java//com/yfny//pattern//facade//example1//src.txt",
                "src//main//java//com/yfny//pattern//facade//example1//des.txt");
    }

    private static void run2() {
        AbstractEncryptFacade ef;//针对抽象外观类编程
        //读取配置文件，反射生成对象
        ef = (AbstractEncryptFacade) XMLUtil.getBean();
        ef.fileEncrypt("src//main//java//com/yfny//pattern//facade//example1//src.txt",
                "src//main//java//com/yfny//pattern//facade//example1//des.txt");
    }

}
