package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserService;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SUAServlet")
public class SUAServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询数据  床架对象  调用方法
        UserService us = new UserServiceImpl();
        List<User> list = us.selectUserAll();
        //将List存到request作用域中
        request.setAttribute("list",list);
//        ServletContext sc = request.getServletContext();
//        sc.setAttribute("list",list);
        //转发
        request.getRequestDispatcher("Userlist.jsp").forward(request,response);
    }
}
