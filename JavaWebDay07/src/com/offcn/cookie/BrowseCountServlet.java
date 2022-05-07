package com.offcn.cookie;

import com.offcn.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/BrowseCountServlet")
public class BrowseCountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得参数
        //1 2 3 4
        String id = request.getParameter("id");
        //获得所有cookie
        Cookie[] cs = request.getCookies();
        //判断是否为null
        if (cs == null ){
            //第一次访问
            Cookie cookie = new Cookie("product", id);
            cookie.setMaxAge(24*60*60);
            cookie.setPath("/");
            response.addCookie(cookie);
        }else{
            //有 cookie
            //调用工具类
            Cookie cookie = CookieUtils.findCookie(cs, "product");
            if (cookie == null){
                //没有访问过product   第一次访问
                Cookie ck = new Cookie("product",id);
                ck.setMaxAge(24*60*60);
                ck.setPath("/");
                response.addCookie(ck);
            }else{
                //访问过product
                //解码 1_2_3_4
                String value = URLDecoder.decode(cookie.getValue(), "utf-8");
                //返回 1,2,3,4数组
                String[] split = value.split(",");
                //true  存在   flase 不存在
                boolean flag = checkIsExist(split, id);
                if (!flag){                                 //编码
                    Cookie ck = new Cookie("product", URLEncoder.encode(value + "," + id,"utf-8"));
                    ck.setMaxAge(24*60*60);
                    ck.setPath("/");
                    response.addCookie(ck);
                }
            }
        }

        response.sendRedirect("browsecountServlet.jsp");
        //request.setAttribute("id",id);
        //request.getRequestDispatcher("show.jsp").forward(request,response);
    }
    //判断id在数组中是否存在
    public static boolean checkIsExist(String [] split,String id){
        boolean flag = false;
        for (String s1 : split){
            if (s1 == id){
                //证明存在这个id
                flag = true;
            }
        }
        return flag;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
