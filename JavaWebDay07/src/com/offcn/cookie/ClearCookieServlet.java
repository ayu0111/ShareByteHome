package com.offcn.cookie;

import com.offcn.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ClearCookieServlet")
public class ClearCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cs = request.getCookies();
        Cookie cookie = CookieUtils.findCookie(cs, "product");
        if(cookie != null){
            cookie.setMaxAge(0);
            cookie.setPath("/");   //设置路径和此时保持在一致
            response.addCookie(cookie);
        }
        response.sendRedirect("browsecountServlet.jsp");
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
