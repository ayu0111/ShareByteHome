package com.offcn.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DruidUtils {

    private static DataSource ds = null;

    static{
        //创建Properties对象
        Properties pro = new Properties();
        //通过当前类class返回输入流对象
        InputStream is = DruidUtils.class.getResourceAsStream("/druid.properties");
        try {
            //从输入流中读取属性列表
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  static DataSource getDataSource(){
        return ds;
    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
    public static void close(Connection conn, PreparedStatement ps){
        close(conn,ps,null);
    }
}

