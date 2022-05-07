<%@ page import="com.offcn.bean.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/15
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有用户</title>
</head>
<body>
<%--  从request作用域中取值  list  --%>
<%
    List<User> list = (List<User>)request.getAttribute("list");
%>
<table border="1px" width="60%" align="center" cellspacing="0">
<tr>
    <td>id</td>
    <td>用户名</td>
    <td>密码</td>
    <td>姓名</td>
    <td>手机号</td>
    <td>出生日期</td>
</tr>
<%
   for (User user: list) {
  %>
    <tr>
        <td>
            <%=user.getId()%>
        </td>
        <td>
            <%=user.getUsername()%>
        </td>
        <td>
            <%=user.getPassword()%>
        </td>
        <td>
            <%=user.getName()%>
        </td>
        <td>
            <%=user.getTelphone()%>
        </td>
        <td>
            <%=user.getBrithday()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
