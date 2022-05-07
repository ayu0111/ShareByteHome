package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //判断是否是第一次访问\
        //字符串体现
        String str = "";
        //创建session   没有返回 null 存在  使用之前的session
        HttpSession session = request.getSession();
        if (session != null){
            session = request.getSession();
            str = "第一次访问";
        }else{
            str = "欢迎回来";
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
