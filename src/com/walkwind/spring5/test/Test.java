package com.walkwind.spring5.test;

import com.walkwind.spring5.ConfigAop;
import com.walkwind.spring5.entity.User;
import com.walkwind.spring5.servcie.UserService;
import com.walkwind.spring5.servcie.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {


    @org.junit.Test
    public void userAdd(){
        ApplicationContext application =   new ClassPathXmlApplicationContext("application.xml");
        UserService userService = application.getBean("userServiceImpl", UserServiceImpl.class);
        List<Object[]> list = new ArrayList<>();
        Object[] user1= {3,"小三",23};
        Object[] user2= {4,"小四",24};
        Object[] user3= {5,"小五",25};
        list.add(user1);
        list.add(user2);
        list.add(user3);
        userService.addUser(list);
    }


    @org.junit.Test
    public void TestAdd(){
        ApplicationContext application =  new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = application.getBean("user", User.class);
//        user.add();
    }

    @org.junit.Test
    public void Test(){
        ApplicationContext application =  new ClassPathXmlApplicationContext("application.xml");
        User user = application.getBean("user", User.class);
//        user.add();
    }
}