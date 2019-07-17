<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/17
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <div id="msgFormPush"></div>
    <!--js脚本会阻塞页面的显示，所以放在body元素的最后面-->
    <script type="text/javascript" src="assets/js/jquery.js"></script>
    <script>
        if(!!window.EventSource){
            var source=new EventSource('push');
            s='';
            source.addEventListener('message',function(e){
                s+=e.data+"<br/>";
                $("#msgFormPush").html(s);
            });
            source.addEventListener('open',function (e) {
                console.log('链接打开');
            },false);
            source.addEventListener('error',function (e) {
                if(e.readyState==EventSource.CLOSED){
                    console.log('链接关闭');
                }else{
                    console.log(e.readyState);
                }
            },false);
        }else{
            console.log("您的浏览器不支持SSE");
        }

    </script>
</body>
</html>
