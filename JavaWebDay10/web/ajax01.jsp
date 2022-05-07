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
    <input type="button" value="异步请求" onclick="fun()">
</body>
    <script src="js/jquery.min.js"></script>
    <script>
        function fun() {
            $.ajax({
                //请求路径
                url:"AjaxServlet",
                //请求参数
                data:"username=zhangsan",
                //数据形式text
                dataType:"text",
                //请求成功后执行方法
                //date是一个形参  服务器返回数据   与上述data无关
                success:function (data) {
                    alert(data);
                },
                //请求失败后执行方法
                error:function () {
                    alert("失败")
                }
            })
        }
    </script>
</html>
