package com.offcn.servlect;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/Demo05Servlet")
public class Demo05Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得参数   文件名称
        String fileName = request.getParameter("fileName");
        //设置响应头
        response.setHeader("Content-Disposition","attachment;filename=" + fileName);
        //创建文件输入流
        InputStream is = this.getServletContext().getResourceAsStream("download/" + fileName);
        //创建文件输出流
        ServletOutputStream os = response.getOutputStream();
        //处理文件  读写
        byte[] data = new byte[1024 * 8];
        int len = -1;  //字节个数
        while((len = is.read(data)) != -1){
            os.write(data,0,len);
        }
        //关流
        is.close();
        os.close();

    }
}
