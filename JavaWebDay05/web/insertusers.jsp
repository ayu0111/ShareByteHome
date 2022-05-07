<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/18
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="InsertServlet" method="post">
        <table border="1px" align="center" width="500px" height="400px" cellspacing="0">
            <tr>
                <td align="center">用户名</td>
                <td>
                    <input type="text" name="username" value="username" placeholder="请输入用户名称">
                </td>
            </tr>
            <tr>
                <td align="center">密码</td>
                <td>
                    <input type="password" name="password" id="password" placeholder="请输入密码">
                </td>
            </tr>
            <tr>
                <td align="center">姓名</td>
                <td>
                    <input type="text" name="name" id="name">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td>
                    <input type="text" name="telephone" id="telephone">
                </td>
            </tr>
            <tr >
                <td align="center">出生日期</td>
                <td>
                    <input type="text" name="birthday" id="birthday">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="注册">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
