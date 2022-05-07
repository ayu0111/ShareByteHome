package com.offcn.cookie;

import com.offcn.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/SecondCookieServlet")
public class SecondCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "我来了";
        //获取所有Cookie
        Cookie[] cookies = request.getCookies();
        //判断是否为null 为null 创建cookie  不为null  遍历cookie
        if (cookies != null) {
            for (Cookie c : cookies) {
                //判断  c和创建c 是是否同一个
                if("beforeTime".equals(c.getName())){
                    str = "上次访问时间" + c.getValue();
                    break;
                }
            }
        }
        //日期转化成字符串
        String date = CookieUtils.dateToString(new Date());
        Cookie cookie = new Cookie("beforeTime", date);
        cookie.setMaxAge(100);
        cookie.setPath("/");
        response.addCookie(cookie);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
