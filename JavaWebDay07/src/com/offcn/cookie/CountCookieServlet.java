package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CountCookieServlet")
public class CountCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建计数器   记录访问次数
        int count = 1;
        //创建标记
        boolean flag = false;
        //创建传递ck值的对象
        Cookie cook = null;
        Cookie[] cookiesArray = request.getCookies();
        //判断cookies数组是否为空  如果为空  创建cookie   不为空则遍历数组
        if (cookiesArray != null) {
            for (Cookie ck : cookiesArray) {
                //如果ckAll中带有cookie
                if ("count".equals(ck.getName())){
                    flag = true;
                    cook = ck;
                }
            }
        }
        if (flag) {  //为true 则不是第一次访问
            count = Integer.parseInt(cook.getValue()) + 1;
        }

        //创建cookie对象 添加cookie
        Cookie cookieOb = new Cookie("count",count + "");
        response.addCookie(cookieOb);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("客户端第" + count + "访问");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
