package com.yfny.pattern.state.example1.state;

import com.yfny.pattern.state.example1.context.Account;

/**
 * Created by jisongZhou on 2019/10/18.
 **/
public abstract class AccountState {

    public Account acc;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}
