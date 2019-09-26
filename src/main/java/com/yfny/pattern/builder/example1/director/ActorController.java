package com.yfny.pattern.builder.example1.director;

import com.yfny.pattern.builder.example1.builder.ActorBuilder;
import com.yfny.pattern.builder.example1.product.Actor;

/**
 * Created by jisongZhou on 2019/9/24.
 **/
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
