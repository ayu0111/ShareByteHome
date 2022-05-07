package com.offcn.dao;

import com.offcn.bean.User;
import com.offcn.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    //查询全部实现类方法
    @Override
    public List<User> selectUserAll() {
        //创建List集合
        List<User> list = null;
        //使用QueryRunner获取源
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //拼接SQL语句
        String sql = "select * from user";
        try {
            //处理结果集
            list = qr.query(sql, new BeanListHandler<User>(User.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //返回list集合
        return list;
    }
}
