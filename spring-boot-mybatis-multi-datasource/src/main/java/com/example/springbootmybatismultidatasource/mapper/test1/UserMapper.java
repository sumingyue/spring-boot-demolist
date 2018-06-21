package com.example.springbootmybatismultidatasource.mapper.test1;

import com.example.springbootmybatismultidatasource.pojo.test1.User;

import java.util.List;

public interface UserMapper {
    //这个方式我自己加的
    List<User> selectAllUser();
}
