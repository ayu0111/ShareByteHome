package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.bean.Users;
import com.offcn.dao.UsersDao;
import com.offcn.dao.UsersDaoImpl;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    UsersDao ud = new UsersDaoImpl();
    public int insertService(Users user) {
        return ud.insertUser(user);
    }

    @Override
    public List<Users> selectUsersAll() {
        return ud.selectUsersAll();
    }

    @Override
    public Users selectUsersById(int id) {
        return ud.selectUsersById(id);
    }

    @Override
    public int upDateUsers(Users user) {
        return ud.upDateUsers(user);
    }

    @Override
    public int deleteUsers(int id) {
        return ud.deleteUsers(id);
    }

    @Override
    public Users selectByUsernameAndPassword(String username, String password) {
        return ud.selectByUsernameAndPassword(username,password);
    }
}
