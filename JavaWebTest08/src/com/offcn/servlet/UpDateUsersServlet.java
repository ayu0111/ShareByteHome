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
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/UpDateUsersServlet")
public class UpDateUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决字符乱码问题
        request.setCharacterEncoding("utf-8");
        //获取参数
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String telephone = request.getParameter("telephone");
        String birthday = request.getParameter("birthday");
        //创建Users对象
        Users users = new Users();
        users.setId(Integer.parseInt(id));
        users.setUsername(username);
        users.setName(name);
        users.setTelephone(telephone);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            users.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //调用方式
        UsersService us = new UsersServiceImpl();
        int result = us.upDateUsers(users);
        if (result != 0){
            request.setAttribute("user",users);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            response.sendRedirect("error.jsp");
        }
        System.out.println(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);


    }
}
