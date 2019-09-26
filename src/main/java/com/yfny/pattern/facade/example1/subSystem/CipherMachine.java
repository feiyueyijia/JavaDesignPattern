package com.yfny.pattern.facade.example1.subSystem;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class CipherMachine {

    public String encrypt(String plainText) {
        System.out.print("数据加密,将明文转换成密文:");
        String es = "";
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }

}
