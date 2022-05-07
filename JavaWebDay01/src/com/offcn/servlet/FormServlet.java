package com.offcn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("<table border=\"1px\" align=\"center\" width=\"400px\" height=\"200px\">\n" +
                "       <tr>\n" +
                "           <td>id</td>\n" +
                "           <td>用户名</td>\n" +
                "           <td>密码</td>\n" +
                "       </tr>\n" +
                "       <tr>\n" +
                "           <td>1</td>\n" +
                "           <td>admin</td>\n" +
                "           <td>123</td>\n" +
                "       </tr>\n" +
                "       <tr>\n" +
                "           <td>2</td>\n" +
                "           <td>zi</td>\n" +
                "           <td>111</td>\n" +
                "       </tr>");
    }
}
