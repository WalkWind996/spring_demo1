package com.walkwind.spring5.servcie;

import com.walkwind.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: spring_demo1
 * @ClassName: UserServcieImpl
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-16 20:32
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(List<Object[]> list) {
        userDao.addUser(list);
    }
}