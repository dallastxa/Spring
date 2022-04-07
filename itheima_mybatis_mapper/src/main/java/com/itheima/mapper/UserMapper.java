package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<User> findByCondition(@Param("user") User user);

    public List<User> findByIds(List<Integer> ids);


}
