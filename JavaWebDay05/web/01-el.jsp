<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/18
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String value = (String)request.getAttribute("name");
    %>
    <!--原始的方式获取值--->
    <%=value%><br>
    <!--通过EL表达式方式
        好处: 简化代码
              getAttribute(key) 当key不存在是返回null
              $大括号{ key}   当key不存在时返回空字符串""
    --->
    ${requestScope.name}<br>
    ${applicationScope.name2}<br>
    ${requestScope.user.id}
    ${requestScope.user.name}
    ${requestScope.user.age}



</body>
</html>
