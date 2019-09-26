package com.yfny.pattern.bridge.example1.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by jisongZhou on 2019/9/25.
 **/
public class XMLUtil {

    public static Object getBean(String args) {
        try {
            //创建 DOM 文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            String path = new File("src//main//java//com/yfny//pattern//bridge//example1//config.xml").getPath();
            doc = builder.parse(new File(path));
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            //获取第一个包含类名的节点，即扩充抽象类
            if (args.equals("image")) {
                classNode = nl.item(0).getFirstChild();
            }
            //获取第二个包含类名的节点，即具体实现类
            if (args.equals("os")) {
                classNode = nl.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
