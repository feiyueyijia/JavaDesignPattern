package com.yfny.pattern.responsibility.example1.handler;

import com.yfny.pattern.responsibility.example1.request.PurchaseRequest;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public abstract class Approver {
    protected Approver successor;   //定义后继对象
    protected String name;          //审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);

}
