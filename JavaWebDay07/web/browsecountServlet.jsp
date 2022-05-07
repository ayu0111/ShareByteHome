<%@ page import="com.offcn.utils.CookieUtils" %>
<%@ page import="java.net.URLDecoder" %>
<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/21
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--id值  是数据库中查询出来的 --%>
    <a href="BrowseCountServlet?id=1">
        手机1
        <img src="img/111.webp">
    </a>
    <a href="BrowseCountServlet?id=2">
        手机2
        <img src="img/222.webp">
    </a>
    <a href="BrowseCountServlet?id=3">
        手机3
        <img src="img/333.webp">
    </a>
    <a href="BrowseCountServlet?id=4">
        手机4
        <img src="img/444.webp">
    </a><br>

    浏览记录:
    <%
        Cookie[] cs = request.getCookies();
        Cookie cookie = CookieUtils.findCookie(cs, "product");
        if (cookie != null) {
            String value = URLDecoder.decode(cookie.getValue(), "utf-8");
            String[] ss = value.split(",");
            for (String s : ss) {
    %>
        <%=s%>
        <img src="img/<%=s%>.webp"style="width: 300px">
    <%
            }
        }
    %>
    <hr>
    <a href="ClearCookieServlet">清楚浏览记录</a>
</body>
</html>
