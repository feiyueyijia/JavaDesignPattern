package com.yfny.pattern.interpreter.example1.terminalExpression;

import com.yfny.pattern.interpreter.example1.abstractExpression.AbstractNode;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    //动作（移动方式）表达式的解释操作
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }
}
