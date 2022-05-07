<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/21
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>修改成功</h1>
    <form action="SelectUsersBynpServlet" method="post">
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

        </table>
    </form>
    <p align="center">
        <a href="LogOutServlet">安全退出</a>
    </p>
</body>
</html>
