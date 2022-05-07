package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01CookieServlet")
public class Demo01CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie
        Cookie cookie = new Cookie("name", "java");
        Cookie cookie1 = new Cookie("age", 12 + "");

        //设置属性
        cookie.setMaxAge(10);
        cookie1.setMaxAge(10);

        cookie.setPath("/");
        cookie1.setPath("/");

        //cookie客户端
        response.addCookie(cookie);
        response.addCookie(cookie1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
