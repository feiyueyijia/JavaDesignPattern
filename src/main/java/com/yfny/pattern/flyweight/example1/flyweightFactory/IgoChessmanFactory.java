package com.yfny.pattern.flyweight.example1.flyweightFactory;

import com.yfny.pattern.flyweight.example1.concreteFlyweight.BlackIgoChessman;
import com.yfny.pattern.flyweight.example1.concreteFlyweight.WhiteIgoChessman;
import com.yfny.pattern.flyweight.example1.flyweight.IgoChessman;

import java.util.Hashtable;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;    //使用 Hashtable 来存储享元对象，充当享元池

    public IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    // 返回享元工厂了的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    // 通过 key 获取存储在 Hashtable 中的享元对象
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }

}
