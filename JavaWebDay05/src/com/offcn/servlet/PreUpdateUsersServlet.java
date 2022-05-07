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

@WebServlet("/PreUpdateUsersServlet")
public class PreUpdateUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取id参数
        String id = request.getParameter("id");
        //创建service对象
        UsersService us = new UsersServiceImpl();
        //将字符串id 转化为int类型id
        Users users = us.selectUsersById(Integer.parseInt(id));
        //将获取到的值存入users
        request.setAttribute("users",users);
        if(users != null){
            //转发到Users_update.jsp
            request.getRequestDispatcher("Users_update.jsp").forward(request,response);
        }else{
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
