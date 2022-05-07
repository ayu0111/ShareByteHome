package com.offcn.servlect;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Demo02Servlet")
public class Demo02Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request作用域内取内容
        String classAddress =(String)request.getAttribute("classAddress");
        //创建ServletContext对象
        ServletContext sc = this.getServletContext();
        String className =(String)sc.getAttribute("className");
        //展示到页面上
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("classAddress=" + classAddress); //null
        writer.println("className=" + className);//1122java


    }
}
