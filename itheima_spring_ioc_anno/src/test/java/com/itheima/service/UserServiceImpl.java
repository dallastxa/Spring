package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/*
<bean id="userService" class="com.itheima.service.UserServiceImpl">
<property name="userDao" ref="userDao"></property>
</bean>*/

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
