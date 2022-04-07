package com.itheima.service;

import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        InputStream rescoureAsStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(rescoureAsStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();

        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        List<User> users= userMapper.findAll();
        System.out.println(users);
        User user=userMapper.findById(1);
        System.out.println(user);
        sqlSession.close();
    }

}
