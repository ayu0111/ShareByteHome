package com.offcn.servlect;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/Demo03Servlet")
public class Demo03Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        String realPath = request.getRealPath("/Demo01Servlet");
        System.out.println(realPath);

        String serverInfo = sc.getServerInfo();
        System.out.println(serverInfo);
    }
}
