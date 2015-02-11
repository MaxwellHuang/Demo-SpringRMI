package com.maxwell.service;

import com.maxwell.common.AccountServiceInterface;

/**
 * User:Maxwell
 * Date:2015/2/11
 * Time:9:55
 */
public class SimpleObject {

    private AccountServiceInterface account;


    public void setAccount(AccountServiceInterface account) {
        this.account = account;
    }

    public void dosomething(){
        String userName = account.getUserName();
        System.out.println(userName);
    }

}
