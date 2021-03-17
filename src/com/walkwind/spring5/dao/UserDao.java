package com.walkwind.spring5.dao;


import java.util.List;

/**
 * @Program: spring_demo1
 * @ClassName: UserDao
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-16 20:30
 **/
public interface UserDao {
    void addMoney();

    void subMoney();

    void addUser(List<Object[]> list);

}
