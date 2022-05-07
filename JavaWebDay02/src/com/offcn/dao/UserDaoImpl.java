package com.offcn.dao;

import com.offcn.bean.User;


import com.offcn.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.SQLException;


public class UserDaoImpl implements UserDao {
    @Override
    public int insertUser(User user) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "insert into user value(null,?,?,?,?,?)";
        try {
            result = qr.update(sql, user.getUsername(), user.getPassword(), user.getUname(), user.getPhone(), user.getBrithday());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}

