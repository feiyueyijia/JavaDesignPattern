package com.yfny.pattern.builder.example1.concreteBuilder;

import com.yfny.pattern.builder.example1.builder.ActorBuilder;

/**
 * Created by jisongZhou on 2019/9/24.
 **/
public class AngelBuilder extends ActorBuilder {

    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
