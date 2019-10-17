package com.yfny.pattern.proxy.example2.realSubject;

import com.yfny.pattern.proxy.example2.subject.AbstractDocumentDAO;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class DocumentDAO implements AbstractDocumentDAO {

    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除 ID 为" + documentId + "的文档信息成功！");
            return true;
        } else {
            System.out.println("删除 ID 为" + documentId + "的文档信息失败！");
            return false;
        }
    }
}
