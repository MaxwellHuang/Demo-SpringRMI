package com.maxwell.local;

import com.maxwell.common.AccountServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User:Maxwell
 * Date:2015/2/13
 * Time:11:02
 */
public class SimpleObject {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        AccountServiceInterface accountService = applicationContext.getBean("accountService", AccountServiceInterface.class);
        accountService.doSomthing();
    }

}
