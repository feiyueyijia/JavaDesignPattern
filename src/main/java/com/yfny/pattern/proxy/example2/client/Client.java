package com.yfny.pattern.proxy.example2.client;

import com.yfny.pattern.proxy.example2.extend.DAOLogHandler;
import com.yfny.pattern.proxy.example2.realSubject.DocumentDAO;
import com.yfny.pattern.proxy.example2.realSubject.UserDAO;
import com.yfny.pattern.proxy.example2.subject.AbstractDocumentDAO;
import com.yfny.pattern.proxy.example2.subject.AbstractUserDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = null;

        //动态创建代理对象，用于代理一个 AbstractUserDAO 类型的真实主题对象
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        proxy.findUserById("张无忌");  //调用代理对象的业务方法

        System.out.println("-------------------------------------------------------------");

        AbstractDocumentDAO docDao = new DocumentDAO();
        handler = new DAOLogHandler(docDao);
        AbstractDocumentDAO proxy_new = null;

        //动态创建代理对象，用于代理一个 AbstractDocumentDAO 类型的真实主题对象
        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("D002");   //调用代理对象的业务方法

    }
}
