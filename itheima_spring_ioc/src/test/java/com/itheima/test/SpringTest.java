package com.itheima.test;
import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {
    //测试scope属性
    @Test
    public void test1(){
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app=new FileSystemXmlApplicationContext("E:\\Spring\\itheima_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserDao userDao1=(UserDao) app.getBean("userDao");
        System.out.println(userDao1);

    }


}
