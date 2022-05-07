<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="com.offcn.bean.Users"%>
<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/18
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户信息</title>
</head>
<body>
    <table border="1px" width="60%" align="center" cellspacing="0">
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>密码</td>
            <td>姓名</td>
            <td>手机号</td>
            <td>出生日期</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="u">
            <tr>
            <tr>
                <td>
                    ${u.id}
                </td>
                <td>
                    ${u.username}
                </td>
                <td>
                    ${u.password}
                </td>
                <td>
                    ${u.name}
                </td>
                <td>
                    ${u.telephone}
                </td>
                <td>
                    ${u.birthday}
                </td>

                <td>
                    <a href="PreUpdateUsersServlet?id=${u.id}">修改</a>
                    <a href="DeleteUsersServlet?id=${u.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
