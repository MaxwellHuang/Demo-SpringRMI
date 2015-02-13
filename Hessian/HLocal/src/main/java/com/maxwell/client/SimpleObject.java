package com.maxwell.client;

import com.maxwell.common.AccountServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * User:Maxwell
 * Date:2015/2/12
 * Time:13:17
 */
@Component
public class SimpleObject {

    @Autowired
    @Qualifier("accountService")
    private AccountServiceInterface accountService;

    @Autowired
    @Qualifier("accountExporter")
    private AccountServiceInterface accountExporter;

    public void doSomeThing() {
        String somthing = accountService.doSomthing();
        System.out.println(somthing);
    }

    public void doSomeExporter() {
        String somthing = accountExporter.doSomthing();
        System.out.println("this is exporter:" + somthing);
    }


}
