package com.walkwind.spring5.servcie;


import java.util.List;

/**
 * @Program: spring_demo1
 * @ClassName: UserService
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-16 20:30
 **/
public interface UserService {

    //模拟转账功能 张三李四money都为1000， 张三向李四转100
    public void transferAccount() throws Exception;

    public void addUser (List<Object[]> list);
}
