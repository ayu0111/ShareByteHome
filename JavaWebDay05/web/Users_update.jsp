<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/20
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户资料</title>
</head>
<body>
    <form action="UpDateUsersServlet" method="post">
        <table border="1px" width="500px" align="center" cellspacing="0">
            <caption>用户修改</caption>
            <tr>
                <td>
                    <input type="hidden" name="id" value="${requestScope.users.id}">
                </td>
            </tr>
            <tr>
                <td align="center">用户名</td>
                <td>
                    <input type="text" name="username" id="username" value="${requestScope.users.username}">
                </td>
            </tr>
            <tr>
                <td align="center">姓名</td>
                <td>
                    <input type="text" name="name" id="name" value="${requestScope.users.name}">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td>
                    <input type="text" name="telephone" id="telephone" value="${requestScope.users.telephone}">
                </td>
            </tr>
            <tr>
                <td align="center">出生日期</td>
                <td>
                    <input type="text" name="birthday" id="birthday" value="${requestScope.users.birthday}">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="修改">
                </td>
            </tr>

        </table>
    </form>
</body>
</html>
