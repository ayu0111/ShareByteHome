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

@WebServlet("/SelectUsersBynpServlet")
public class SelectUsersBynpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //Users user = (Users)request.getAttribute("user");
        //查询数据  床架象  调用方法
        UsersService us = new UsersServiceImpl();
        Users users = us.selectByUsernameAndPassword(username, password);
        request.setAttribute("user",users);
        //转发
        response.sendRedirect("logoutservlet.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}