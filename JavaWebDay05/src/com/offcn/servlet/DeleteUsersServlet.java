package com.offcn.servlet;

import com.offcn.service.UsersService;
import com.offcn.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteUsersServlet")
public class DeleteUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得id参数
        String id = request.getParameter("id");
        //调用方法
        UsersService us = new UsersServiceImpl();
        int result = us.deleteUsers(Integer.parseInt(id));
        if (result != 0){
            response.sendRedirect("success.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
