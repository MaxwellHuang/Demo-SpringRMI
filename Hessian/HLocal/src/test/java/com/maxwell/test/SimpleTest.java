package com.maxwell.test;

import com.maxwell.client.SimpleObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User:Maxwell
 * Date:2015/2/12
 * Time:13:24
 */
public class SimpleTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-local.xml");
        SimpleObject simpleObject = applicationContext.getBean("simpleObject", SimpleObject.class);
        simpleObject.doSomeThing();
        simpleObject.doSomeExporter();
    }

}
