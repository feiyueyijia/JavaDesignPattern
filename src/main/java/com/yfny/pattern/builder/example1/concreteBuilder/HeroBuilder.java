package com.yfny.pattern.builder.example1.concreteBuilder;

import com.yfny.pattern.builder.example1.builder.ActorBuilder;

/**
 * Created by jisongZhou on 2019/9/24.
 **/
public class HeroBuilder extends ActorBuilder {

    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
