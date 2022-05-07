<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/22
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("pagename","pageContext");
    %>

        ${pageScope.pagename}
        ${requestScope.reqname}
        ${sessionScope.sessname}
        ${applicationScope.scname}

</body>
</html>
