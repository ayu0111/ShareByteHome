<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/22
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p align="center">欢迎${sessionScope.user.username}登录本网站</p>
    <p align="center">您的信息</p>
    <form action="UpDateUsersServlet?id=${requestScope.user.id}" method="post">
        <table border="1px" width="500px" align="center" cellspacing="0">
            <caption>用户修改</caption>
            <tr>
                <td align="center">用户名</td>
                <td>
                    <input type="text" name="username" id="username" value="${requestScope.user.username}">
                </td>
            </tr>
            <tr>
                <td align="center">姓名</td>
                <td>
                    <input type="text" name="name" id="name" value="${requestScope.user.name}">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td>
                    <input type="text" name="telephone" id="telephone" value="${requestScope.user.telephone}">
                </td>
            </tr>
            <tr>
                <td align="center">出生日期</td>
                <td>
                    <input type="text" name="birthday" id="birthday" value="${requestScope.user.birthday}">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="修改">
                </td>
            </tr>

        </table>
    </form>
    <p align="center">
        <a href="LogOutServlet">安全退出</a>
    </p>
</div>
</body>
</html>
