package com.offcn.servlet;

import com.offcn.bean.Users;
import com.offcn.service.UsersService;
import com.offcn.service.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码问题
        request.setCharacterEncoding("utf-8");
        //获取所需参数  username password
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //创建service对象
        UsersService us = new UsersServiceImpl();
        Users user = us.selectByUsernameAndPassword(username, password);

        //创建cookie
        Cookie cookie1 = new Cookie("username",username);
        Cookie cookie2 = new Cookie("password",password);
        //设置存活时间
        cookie1.setMaxAge(24*60*60);
        cookie2.setMaxAge(24*60*60);
        //设置路径
        cookie1.setPath("/");
        cookie2.setPath("/");
        //添加Cookie
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        //获得session
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        session.setAttribute("user",user);
        if (user != null) {
            request.setAttribute("user",user);
            request.getRequestDispatcher("logoutservlet.jsp").forward(request,response);
        }else{
            response.sendRedirect("login.jsp?msg=paramerror");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
