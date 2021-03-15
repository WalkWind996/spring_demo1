package com.walkwind.spring5;

/**
 * @Program: spring_demo1
 * @ClassName: UserProxy
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-15 23:37
 **/

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect //生成代理对象
@Order(1)
public class UserProxy {
    //@Before 注解表示作为前置通知
    @Before(value = "execution(* com.walkwind.spring5.User.add(..))")
    public void before() {
        System.out.println("before.........");
    }
    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.walkwind.spring5.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }
    //最终通知
    @After(value = "execution(* com.walkwind.spring5.User.add(..))")
    public void after() {
        System.out.println("after.........");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.walkwind.spring5.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }
    //环绕通知
    @Around(value = "execution(* com.walkwind.spring5.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws
            Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    } }