package com.offcn.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CookieSessionServlet")
public class CookieSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cookie cookie = new Cookie("jess", session.getId());
        response.addCookie(cookie);
        session.setAttribute("sessname",123);

        response.sendRedirect("show.jsp;jsessionid=" + session.getId());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
