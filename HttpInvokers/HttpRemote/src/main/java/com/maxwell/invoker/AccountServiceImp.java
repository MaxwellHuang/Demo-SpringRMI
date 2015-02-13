package com.maxwell.invoker;

import com.maxwell.common.AccountServiceInterface;

/**
 * User:Maxwell
 * Date:2015/2/13
 * Time:10:43
 */
public class AccountServiceImp implements AccountServiceInterface {
    @Override
    public String doSomthing() {
        System.out.println("this is a invoker");
        return "invoker";
    }
}
