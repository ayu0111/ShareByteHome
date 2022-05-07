package com.offcn.dao;


import com.offcn.bean.Users;
import com.offcn.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;


public class UsersDaoImpl implements UsersDao {
    @Override
    public int insertUser(Users user) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "insert into users value(null,?,?,?,?,?)";
        try {
            result = qr.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getTelephone(), user.getBirthday());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Users> selectUsersAll() {
        //创建List集合
        List<Users> list = null;
        //使用QueryRunner获取源
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //拼接SQL语句
        String sql = "select * from users";
        try {
            //处理结果集
            list = qr.query(sql, new BeanListHandler<Users>(Users.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //返回list集合
        return list;
    }

    @Override
    public Users selectUsersById(int id) {
        Users us = null;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from users where id = ?";
        try {
            us = qr.query(sql,new BeanHandler<>(Users.class),id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return us;
    }

    @Override
    public int upDateUsers(Users user) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "update users set username = ?,name = ?,telephone = ?,birthday = ? where id = ?";
        try {
            result = qr.update(sql, user.getUsername(),user.getName(),user.getTelephone(), user.getBirthday(), user.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUsers(int id) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "delete from users where id = ?";
        try {
            result = qr.update(sql,id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public Users selectByUsernameAndPassword(String username, String password) {
        Users user = null;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from users where username = ? and password = ?";
        try {
            user = qr.query(sql, new BeanHandler<>(Users.class), username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;

    }
}

