package com.yfny.pattern.builder.example1.builder;

import com.yfny.pattern.builder.example1.product.Actor;

/**
 * Created by jisongZhou on 2019/9/24.
 **/
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }

}
