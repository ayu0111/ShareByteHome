package com.offcn.servlet;

import com.offcn.bean.User;

import com.offcn.service.UserService;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //requset 缓冲 解决中文乱码问题
        request.setCharacterEncoding("utf-8");
        //获取参数    表单name
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String uname = request.getParameter("uname");
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        //创建对象,把参数封装到user中
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setUname(uname);
        user.setPhone(phone);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setBrithday(sdf.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        UserDao ud = new UserDaoImpl();
//        ud.insertUser(user);
        UserService us = new UserServiceImpl();
        int result = us.insertService(user);
        if(result != 0){
            request.getRequestDispatcher("success.html").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
