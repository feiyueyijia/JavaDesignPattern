package com.yfny.pattern.proxy.example2.realSubject;

import com.yfny.pattern.proxy.example2.subject.AbstractUserDAO;

/**
 * Created by jisongZhou on 2019/10/17.
 **/
public class UserDAO implements AbstractUserDAO {

    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询 ID 为" + userId + "的用户信息成功！");
            return true;
        } else {
            System.out.println("查询 ID 为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
