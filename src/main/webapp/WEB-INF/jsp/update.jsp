<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        <form action="update.do" id="imm" method="post">
            <table border="1px" style="text-align: center;">
                <tr>
                    <td>员工编号</td>
                    <td><input id="empid" name="empid" value="${emp.empid}" onblur="checkCode();"><span
                            id="codeMessage"></span></td>
                </tr>
                <tr>
                    <td>员工</td>
                    <td><input name="empname" value="${emp.empname}"></td>
                </tr>
                <tr>
                    <td>所属部门</td>
                    <td style="text-align: left;"><select name="empdept">
                        <c:forEach items="${deptList}" var="deptlist">
                            <option value="${deptlist.deptid}"
                                    <c:if test="${deptlist.deptid==emp.empdept}">selected</c:if>>${deptlist.deptname}</option>
                        </c:forEach>
                    </select></td>
                </tr>
                <tr>
                    <td>工作</td>
                    <td><input name="empjob" value="${emp.empjob}"></td>
                </tr>
                <tr>
                    <td>工资</td>
                    <td><input name="empwages" value="${emp.empwages}"></td>
                </tr>
                <tr>
                    <td>图片上传</td>
                    <td>
                        <img id="img" src="${emp.path}" width="120px" height="150px">
                        <input type="file" name="fileImage" onchange="uploadImage();">
                        <input type="hidden" name="path" id="pic">
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="提交">
                        <a href="/selectAll.do"><input type="button" value="取消"></a>
                    </td>
                </tr>
            </table>
        </form>
    </div>


</div>
</body>
<
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