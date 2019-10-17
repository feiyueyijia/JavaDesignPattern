package com.yfny.pattern.responsibility.example1.concreteHandler;

import com.yfny.pattern.responsibility.example1.handler.Approver;
import com.yfny.pattern.responsibility.example1.request.PurchaseRequest;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() +
                "元，采购目的：" + request.getPurpose() + "。");    //处理请求
    }
}
