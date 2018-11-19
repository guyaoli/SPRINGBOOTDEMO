package com.gu.springdemo1.sys.dao;

import com.gu.springdemo1.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User findUserByName(String name);
}
