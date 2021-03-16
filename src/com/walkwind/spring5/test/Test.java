package com.walkwind.spring5.test;

import com.walkwind.spring5.ConfigAop;
import com.walkwind.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void TestAdd(){
        ApplicationContext application =  new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = application.getBean("user", User.class);
        user.add();
    }

    @org.junit.Test
    public void Test(){
        ApplicationContext application =  new ClassPathXmlApplicationContext("application.xml");
        User user = application.getBean("user", User.class);
        user.add();
    }
}