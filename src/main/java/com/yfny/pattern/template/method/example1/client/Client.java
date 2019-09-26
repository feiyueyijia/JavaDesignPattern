package com.yfny.pattern.template.method.example1.client;

import com.yfny.pattern.template.method.example1.abstractClass.Account;
import com.yfny.pattern.template.method.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/26.
 **/
public class Client {

    public static void main(String[] args) {
        Account account;
        account = (Account) XMLUtil.getBean();//读取配置文件，反射生成对象
        account.handle("张无忌", "123456");
    }

}
