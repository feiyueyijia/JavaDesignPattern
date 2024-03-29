package com.yfny.pattern.builder.example1.client;

import com.yfny.pattern.builder.example1.builder.ActorBuilder;
import com.yfny.pattern.builder.example1.director.ActorController;
import com.yfny.pattern.builder.example1.product.Actor;
import com.yfny.pattern.builder.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/9/25.
 **/
public class Client {

    public static void main(String[] args) {
        ActorBuilder ab;//针对抽象建造者编程
        ab = (ActorBuilder) XMLUtil.getBean();//反射生成具体建造者对象

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab);//通过指挥者创建完整的建造者对象

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());


    }
}
