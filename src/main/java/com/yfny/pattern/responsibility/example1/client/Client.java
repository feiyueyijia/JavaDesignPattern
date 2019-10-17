package com.yfny.pattern.responsibility.example1.client;

import com.yfny.pattern.responsibility.example1.concreteHandler.Congress;
import com.yfny.pattern.responsibility.example1.concreteHandler.Director;
import com.yfny.pattern.responsibility.example1.concreteHandler.President;
import com.yfny.pattern.responsibility.example1.concreteHandler.VicePresident;
import com.yfny.pattern.responsibility.example1.handler.Approver;
import com.yfny.pattern.responsibility.example1.request.PurchaseRequest;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest prl = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(prl);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
