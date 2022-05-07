package com.offcn.servlet;

import com.offcn.service.BookDaoService;
import com.offcn.service.BookDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteBooksServlet")
public class DeleteBooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookDaoService bds = new BookDaoServiceImpl();
        String id = request.getParameter("id");
        int result = bds.deleteBook(Integer.parseInt(id));
        if (result != 0){
            response.sendRedirect("success.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
