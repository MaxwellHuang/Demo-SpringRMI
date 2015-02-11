package com.maxwell.service;

import com.maxwell.common.AccountServiceInterface;

/**
 * User:Maxwell
 * Date:2015/2/11
 * Time:9:28
 */
public class AccountServiceImp implements AccountServiceInterface {

    @Override
    public String getUserName() {
        System.out.printf("Yes! It is working!!!!");
        return "this is a test User Name";
    }

}
