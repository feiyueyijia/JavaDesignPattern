package com.yfny.pattern.interpreter.example1.nonterminalExpression;

import com.yfny.pattern.interpreter.example1.abstractExpression.AbstractNode;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class AndNode extends AbstractNode {
    private AbstractNode left;  //And 的左表达式
    private AbstractNode right; //And 的右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    //And 表达式解释操作
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
