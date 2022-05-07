<%@ page import="com.offcn.bean.Users" %>
<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/22
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--获得session 储存user对象 判断user是否存在  没有登录则不存在 跳转到登录页面 --%>
    <%
        HttpSession sess = request.getSession();
        Users user = (Users)sess.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
        }
    %>

</body>
</html>
