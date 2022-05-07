package com.offcn.servlet;


import com.offcn.bean.Users;
import com.offcn.service.UsersService;
import com.offcn.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectUsersServlet")
public class SelectUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询数据  床架象  调用方法
        UsersService us = new UsersServiceImpl();
        List<Users> list = us.selectUsersAll();
        //将List存到request作用域中
        request.setAttribute("list",list);
//        ServletContext sc = request.getServletContext();
//        sc.setAttribute("list",list);
        //转发
        request.getRequestDispatcher("selectusers.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
