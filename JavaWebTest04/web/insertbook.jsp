<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/15
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="InsertBookServlet" method="get">
    <table border="1px" cellspacing="0" align="center" width="500px" height="400px">
        <tr>
            <td align="right">图书名称</td>
            <td>
                <input type="text" name="bookname" id="bookname" placeholder="请输入图书名">
            </td>
        </tr>
        <tr>
            <td align="right">作者</td>
            <td>
                <input type="text" name="name" id="name">
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
