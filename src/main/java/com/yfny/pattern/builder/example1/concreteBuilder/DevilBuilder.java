package com.yfny.pattern.builder.example1.concreteBuilder;

import com.yfny.pattern.builder.example1.builder.ActorBuilder;

/**
 * Created by jisongZhou on 2019/9/24.
 **/
public class DevilBuilder extends ActorBuilder {

    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
