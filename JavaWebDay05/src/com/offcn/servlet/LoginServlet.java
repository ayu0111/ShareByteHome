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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码问题
        request.setCharacterEncoding("utf-8");
        Users user = null;
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //创建service对象

        UsersService us = new UsersServiceImpl();
        user = us.selectByUsernameAndPassword(username,password);
        if(user != null){
            //成功
            response.sendRedirect("success.jsp");
        }else{
            //登陆失败
            response.sendRedirect("login.jsp?msg=paramerror");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
