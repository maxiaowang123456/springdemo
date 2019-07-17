<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/16
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
    <script src="assets/js/jquery.js" type="text/javascript"></script>
</head>
<body>

    <div class="upload">
        <span style="color:red;display:none">上传文件类型不正确</span>
        <form method="post" enctype="multipart/form-data" action="upload">
            <input type="file" name="files" accept="image/*" id="file1">
            <input type="button" value="添加" id="btn" onclick="addFile()">
            <br/>
            <hr/>
            <input type="button" value="上传" onclick="check()"/>
        </form>
    </div>
</body>
<script type="text/javascript">
    var i=0;
    function addFile(){
        i++;
        //上传文件元素
        var fileEle="<input type='file' name='files' accept='image/*' id='file"+(i+1)+"'>";
        //删除按钮元素，紧跟在文件元素后面
        var delEle="<input type='button' value='删除' id='delbtn"+i+"' onclick='delFile(this.id)'>";
        $("[type='file']:last").after(delEle,"<br/>",fileEle);
    };
    function delFile(id){
        //删除前一个同胞元素
        $("#"+id).prev().remove();
        //删除后一个同胞元素
        $("#"+id).next().remove();
        //删除自己
        $("#"+id).remove();
    }

    function check(){
       $("[type='file']").each(function(){
           var suffix=$(this).val().substring($(this).val().indexOf(".")+1,$(this).val().length);
           if(suffix.indexOf("jpg")>=0||suffix.indexOf("gif")>=0||suffix.indexOf("jpeg")>=0||suffix.indexOf("png")>=0){
               $("form").submit();
           }else{
               $("span").show();
           }
       });

    }
</script>
</html>
