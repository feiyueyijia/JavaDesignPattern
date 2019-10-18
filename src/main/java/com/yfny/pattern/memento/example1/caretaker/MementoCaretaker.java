package com.yfny.pattern.memento.example1.caretaker;

import com.yfny.pattern.memento.example1.memento.ChessmanMemento;

import java.util.ArrayList;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public class MementoCaretaker {
    //定义一个集合来存储多个备忘录
    private ArrayList<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
