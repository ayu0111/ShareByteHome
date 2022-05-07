package com.offcn.filter;

import com.offcn.bean.Users;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/index.jsp"})
public class LoginFilter implements Filter {
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        //登陆时设置登录信息到session 取 uesr信息   当user不存在时重新登陆 存在时登陆过直接放行
        if (user == null) {
            response.sendRedirect("login.jsp?msg=pleaselogin");
        }else{
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
