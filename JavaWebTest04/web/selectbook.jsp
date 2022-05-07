<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.offcn.bean.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/15
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" width="60%" align="center" cellspacing="0">
    <tr>
        <td>id</td>
        <td>图书名称</td>
        <td>作者</td>
    </tr>
     <c:forEach items="${requestScope.list}" var="book">
    <tr>
        <td>
            ${book.id}
        </td>
        <td>
            ${book.bookName}
        </td>
        <td>
            ${book.author}
        </td>
         <td>
             <a href="DeleteBooksServlet?id=${book.id}">删除图书</a>
         </td>
    </tr>
     </c:forEach>
</table>
</body>
</html>
