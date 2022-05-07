package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserDao;
import com.offcn.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    UserDao us = new UserDaoImpl();
    @Override
    public int insertService(User user) {
        return us.insertUser(user);
    }
}
