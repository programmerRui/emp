<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        #body {
            margin: 0px auto;
            width: 800px;
            height: 600px;
        }
    </style>
</head>
<body>
<div id="body">
    <div style="margin: 0px auto; width: 500px;">
        <form action="/add.do" id="imm" method="post" enctype="multipart/form-data">
            <table border="1px" style="text-align: center;">
                <tr>
                    <td>员工编号</td>
                    <td>${emp.empid}</td>
                </tr>
                <tr>
                    <td>员工</td>
                    <td>${emp.empname}</td>
                </tr>
                <tr>
                    <td>所属部门编号</td>
                    <td style="text-align: left;">
                        ${emp.empdept}</td>
                </tr>
                <tr>
                    <td>工作</td>
                    <td>${emp.empjob}</td>
                </tr>
                <tr>
                    <td>工资</td>
                    <td>${emp.empwages}</td>
                </tr>
                <tr>
                    <td>图片上传</td>
                    <td>
                        <c:if test="${emp.path!=null}">
                            <img id="img" src="${emp.path}" width="120px" height="150px">
                            <a href="download.do?imagepath=${emp.path}">下载</a>
                        </c:if>
                        <c:if test="${emp.path==null}">未添加图片</c:if>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="提交">
                        <a href="selectAll.do"><input type="button" value="取消"></a></td>
                </tr>
            </table>
        </form>
    </div>


</div>
</body>

<script type="text/javascript" src="../../resource/js/jquery_2.1.4_baidu_min.js"></script>
<script type="text/javascript" src="../../resource/js/jquery-form.js"></script>
<script type="text/javascript">
    function uploadImage() {
        //编写ajax
        var obj = {
            url: "imageupload.do",
            dataType: "json",
            type: "post",
            success: function (data) {
                $("#img").attr("src", data.imagePath);
                $("#pic").attr("value", data.imagePath);
            }
        };
        //提交form
        $("#imm").ajaxSubmit(obj);
    }
</script>
</html>