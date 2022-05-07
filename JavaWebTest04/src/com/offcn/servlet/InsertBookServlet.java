package com.offcn.servlet;

import com.offcn.bean.Book;
import com.offcn.service.BookDaoService;
import com.offcn.service.BookDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/InsertBookServlet")
public class InsertBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request  解决中文缓冲乱码问题
        request.setCharacterEncoding("utf-8");
        //获取参数  表单name
        String bookName = request.getParameter("bookname");
        String name = request.getParameter("name");

        //将数据封装到对象中
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(name);

        //创建对象
        BookDaoService bds = new BookDaoServiceImpl();
        int result = bds.insertBook(book);
        if (result != 0){
            request.getRequestDispatcher("tianjia.html").forward(request,response);
        }
        System.out.println(result);

    }
}
