package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
/*
<bean id="userService" class="com.itheima.service.UserServiceImpl">
<property name="userDao" ref="userDao"></property>
</bean>*/

//@Component("userService")
@Service("userService")
@Scope("prototype")
//@Scope("singleton")
public class UserServiceImpl implements UserService{

    @Value("${jdbc.driver}")
    private String driver;

    //@Autowired
    //@Qualifier("userDao")//是按照id名称从容器中匹配但是此处要结合Autowired一起使用

    @Resource(name = "userDao")//相当于@Autowired+@Qualifier
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("Service init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Service destroy...");
    }

/*    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
}
