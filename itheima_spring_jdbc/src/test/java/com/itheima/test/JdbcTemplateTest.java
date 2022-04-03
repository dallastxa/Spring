package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    @Test
    //测试jdbctemplate开发步骤
    public void test1() throws Exception{
        //创建数据源对象
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        //执行操作
        int row=jdbcTemplate.update("insert into account values(?,?)","tom",5000);
        System.out.println(row);
    }

    @Test
    //测试spring产生jdbc模板对象
    public void test2() throws Exception{
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate=app.getBean(JdbcTemplate.class);
        int row=jdbcTemplate.update("insert into account values(?,?)","lisi",5000);
        System.out.println(row);
    }
}
