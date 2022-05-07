package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserDao;
import com.offcn.dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    //创建UserDao对象
    UserDao us = new UserDaoImpl();
    //实现查询方法
    @Override
    public List<User> selectUserAll() {
        return us.selectUserAll();
    }
}
