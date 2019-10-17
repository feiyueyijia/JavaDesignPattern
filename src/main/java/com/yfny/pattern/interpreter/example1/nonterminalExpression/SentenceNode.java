package com.yfny.pattern.interpreter.example1.nonterminalExpression;

import com.yfny.pattern.interpreter.example1.abstractExpression.AbstractNode;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子的解释操作
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
