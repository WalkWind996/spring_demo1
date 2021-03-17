package com.walkwind.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Program: spring_demo1
 * @ClassName: UserDaoImpl
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-16 20:33
 **/
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        jdbcTemplate.update("update user set money = ? where id  = ?",1100,1);
    }
    @Override
    public void subMoney() {
        jdbcTemplate.update("update user set money = ? where id  = ?",900,2);
    }
    @Override
    public void addUser(List<Object[]> list) {
        jdbcTemplate.batchUpdate("insert into user (id,name,age)values(?,?,?)",list);
    }


}