package com.maxwell.test;

import com.maxwell.service.SimpleObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User:Maxwell
 * Date:2015/2/11
 * Time:10:47
 */
public class LocalTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-local.xml");
        SimpleObject simpleObject = applicationContext.getBean("simpleObject", SimpleObject.class);
        simpleObject.dosomething();
    }

}
