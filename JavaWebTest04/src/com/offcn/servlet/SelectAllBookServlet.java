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
import java.util.List;

@WebServlet("/SelectAllBookServlet")
public class SelectAllBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询数据  创建对象  调用方法
        BookDaoService us = new BookDaoServiceImpl();
        List<Book> list = us.selectBookAll();
        //将List存到request作用域中
        request.setAttribute("list",list);
//        ServletContext sc = request.getServletContext();
//        sc.setAttribute("list",list);
        //转发
        request.getRequestDispatcher("selectbook.jsp").forward(request,response);
    }
}
