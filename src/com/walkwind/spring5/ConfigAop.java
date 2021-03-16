package com.walkwind.spring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Program: spring_demo1
 * @ClassName: ConfigAop
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-16 09:46
 **/
@Configuration
@ComponentScan(basePackages = {"com.walkwind"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}