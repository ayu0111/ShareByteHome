package com.offcn.dao;

import com.offcn.bean.Book;
import com.offcn.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao{

    @Override
    public int insertBook(Book book) {
        //初始话变量
        int result = 0;
        //获取数据源
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //拼接SQL语句
        String sql = "insert into books value(null,?,?)";
        try {
            result = qr.update(sql,book.getBookName(),book.getAuthor());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Book> selectBookAll() {
        List<Book> list = null;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from books";
        try {
           list= qr.query(sql,new BeanListHandler<Book>(Book.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public int deleteBook(int id) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "delete from books where id = ?";
        try {
            result = qr.update(sql, id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}
