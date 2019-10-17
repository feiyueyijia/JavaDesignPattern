package com.yfny.pattern.interpreter.example1.terminalExpression;

import com.yfny.pattern.interpreter.example1.abstractExpression.AbstractNode;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        return this.distance;
    }
}
