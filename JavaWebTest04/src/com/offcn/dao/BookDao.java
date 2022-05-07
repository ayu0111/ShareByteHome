package com.offcn.dao;

import com.offcn.bean.Book;

import java.util.List;

public interface BookDao {

    //添加图书
    int insertBook(Book book);

    //查询全部图书
    List<Book> selectBookAll();

    //删除
    int deleteBook(int id);
}
