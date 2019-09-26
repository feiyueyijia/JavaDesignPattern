package com.yfny.pattern.facade.example1.facade;

import com.yfny.pattern.facade.example1.subSystem.FileReader;
import com.yfny.pattern.facade.example1.subSystem.FileWriter;
import com.yfny.pattern.facade.example1.subSystem.NewCipherMachine;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class NewEncryptFacade extends AbstractEncryptFacade {

    //维持对子系统对象的引用
    private FileReader reader;
    private NewCipherMachine cipher;
    private FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }

    //调用子系统对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }

}
