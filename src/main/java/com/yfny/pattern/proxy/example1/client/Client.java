package com.yfny.pattern.proxy.example1.client;

import com.yfny.pattern.proxy.example1.subject.Searcher;
import com.yfny.pattern.proxy.example1.utils.XMLUtil;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过", "玉女心经");
    }
}
