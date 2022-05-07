package com.offcn.dao;

import com.offcn.bean.User;

import java.util.List;

public interface UserDao {
    //查询全部
    List<User> selectUserAll();
}
