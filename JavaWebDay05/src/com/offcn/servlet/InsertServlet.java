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
import java.util.Date;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request缓冲  解决乱码问题
        request.setCharacterEncoding("utf-8");
        //获取参数   表单中所有输入的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String telephone = request.getParameter("telephone");
        String birthday = request.getParameter("birthday");
        //创建对象  把数据存入到对象中
        Users us = new Users();
        us.setUsername(username);
        us.setPassword(password);
        us.setName(name);
        us.setTelephone(telephone);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            us.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //调用JDBC方法
        //创建service对象
        UsersService usersService = new UsersServiceImpl();
        int result = usersService.insertService(us);
        if (result != 0){
            request.getRequestDispatcher("success.html").forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
