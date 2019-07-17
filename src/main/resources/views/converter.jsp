<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/16
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
    <div id="resp"></div>
    <input type="button" value="请求" onclick="req()">
<script src="assets/js/jquery.js" type="text/javascript"></script>
<script>
    function req(){
        $.ajax({
            url:"convert",
            data:"1-zs",
            type:"post",
            contentType:"application/x-wy",
            success:function(data){
                $("#resp").html(data);
            }
        })
    };
</script>
</body>
</html>
