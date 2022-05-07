<%--
  Created by IntelliJ IDEA.
  User: 83552
  Date: 2022/4/28
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <input type="button" value="异步请求" onclick="fun2()">
</body>
    <script src="js/jquery.min.js"></script>
<script>
    function fun2(){
        //$.post(url,data,success,dataType)
        $.post("AjaxServlet","username=wangwu",function (data){
            alert(data);
        },"text");
    }
</script>

</html>
