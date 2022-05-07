package com.offcn.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Demo04SessionServlet")
public class Demo04SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpServletRequest
        request.setAttribute("reqname","request");

        //HttpSession
        HttpSession session = request.getSession();
        session.setAttribute("sessname","session");

        //ServletContext
        ServletContext sc = request.getServletContext();
        sc.setAttribute("scname","servletContext");

        //转发
        request.getRequestDispatcher("text.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
