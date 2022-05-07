package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FirstCookieServlet")
public class FirstCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建字符串  识别访问次数
        String str = "第一次访问";
        //创建标记
        boolean flag = false;
        //获得所有Cookie  数组
        //数组
        Cookie[] cookies = request.getCookies();
        //判断此时Cookie是否为空   为空  第一次访问
        if (cookies != null){
            //如果cookie不为空   有两种情况
            //cookie和服务器端响应给浏览器端cookie是否为同一个
            //遍历
            for (Cookie  cookie : cookies) {
                //是同一一个   欢迎回来
                if ("name1".equals(cookie.getName())) {
                    //取出cookie名字 若和name1相同
                    flag = true;
                    break;
                }
                //不是同一个   第一次访问
            }
        }
        if(flag){
            //ture  不是第一次访问
            str = "欢迎回来";
        }else{
            //false  是第一访问
            //创建cookie
            Cookie cookie = new Cookie("name1", "haha");
            cookie.setMaxAge(3);//cookie存活时间
            //服务器端把cookie响应给客户端
            response.addCookie(cookie);
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
