package com.offcn.servlect;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01Servlet")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request作用域中添加内容
        request.setAttribute("classAddress","6-106");
        //转发
        request.getRequestDispatcher("/Demo02Servlet").forward(request,response);
        //ServletContext创建对象添加
        ServletContext sc = this.getServletContext();
        sc.setAttribute("className","1122java");
    }
}
