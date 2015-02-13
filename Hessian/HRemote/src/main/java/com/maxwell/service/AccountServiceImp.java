package com.maxwell.service;


import com.maxwell.common.AccountServiceInterface;

/**
 * User:Maxwell
 * Date:2015/2/12
 * Time:11:01
 */
public class AccountServiceImp implements AccountServiceInterface {
    @Override
    public String doSomthing() {
        System.out.println("Hessian has do something");
        return "hessian:go!";
    }
}
