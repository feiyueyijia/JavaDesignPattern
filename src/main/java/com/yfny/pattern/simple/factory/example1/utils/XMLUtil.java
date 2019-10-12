package com.yfny.pattern.simple.factory.example1.utils;

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

    public static String getChartType() {
        try {
            //创建 DOM 文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            String path = new File("src//main//java//com/yfny//pattern//simple//factory//example1//config.xml").getPath();
            doc = builder.parse(new File(path));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
