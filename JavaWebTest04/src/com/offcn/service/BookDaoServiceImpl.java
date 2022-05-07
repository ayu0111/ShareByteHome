package com.offcn.service;

import com.offcn.bean.Book;
import com.offcn.dao.BookDao;
import com.offcn.dao.BookDaoImpl;

import java.util.List;

public class BookDaoServiceImpl implements BookDaoService{

    BookDao bd = new BookDaoImpl();
    @Override
    public int insertBook(Book book) {
        return bd.insertBook(book);
    }

    @Override
    public List<Book> selectBookAll() {
        return bd.selectBookAll();
    }

    @Override
    public int deleteBook(int id) {
        return bd.deleteBook(id);
    }
}
