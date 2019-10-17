package com.yfny.pattern.proxy.example1.realSubject;

import com.yfny.pattern.proxy.example1.subject.Searcher;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class RealSearcher implements Searcher {
    //模拟查询商务信息
    public String doSearch(String userId, String keyword) {
        System.out.println("用户'" + userId + "'使用关键词'" + keyword + "'查询商务信息！");
        return "返回具体内容";
    }
}
