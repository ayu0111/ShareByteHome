package com.offcn.servlet;

import com.offcn.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo03Servlet")
public class Demo03Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(1);
        user.setName("admin");
        user.setAge(18);
        request.setAttribute("user",user);
        request.getRequestDispatcher("01-el.jsp").forward(request,response);

    }
}
