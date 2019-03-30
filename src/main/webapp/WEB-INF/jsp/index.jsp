<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="../../resource/js/jquery_2.1.4_baidu_min.js"></script>
    <script type="text/javascript" src="../../resource/js/jquery-form.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function doPage(pageno) {
            //.给表单的当前也那么赋值
            $("#pageno").val(pageno);
            //提交查询的表单
            $("#query").submit();
        }

        function changecheckBox(check) {
            var input = $("input[name='empid']");
            if (check) {
                $(input).each(function (i) {
                    this.setAttribute("checked", "checked");
//this.setAttribute("checked","true");
                })
            } else {
                $(input).each(function (i) {
                    this.removeAttribute("checked");
                })
            }
        }

        function deletebyId() {
            if (confirm("你确定要删除这条信息？") == true) {
                return true;
            } else {
                return false;
            }
        }

        function deleteAll() {
            if (confirm("你确定要删除这条信息?") == true) {
                $("#delete").submit();
            }
        }
    </script>

</head>
<body>
<div style="height: 600px; width: 800px; margin: 0px auto;">


    <form action="selectAll.do" method="post" id="query">
        部门分类<select name="empdeptid">
        <option value="0">全部</option>
        <c:forEach items="${dept}" var="depts">
            <option value="${depts.deptid}"
                    <c:if test="${depts.deptid==emp.deptid}" >selected="selected"</c:if>>${depts.deptname}</option>
        </c:forEach>
    </select> &nbsp; 员工姓名<input name="empname" value="${empname}">
        &nbsp;工资不低于：<input name="empwages" value="${empwages}">
        <input type="hidden" name="now" id="pageno"> <input
            type="submit" value="查询">
    </form>
    <a href="toadd.do">添加</a> &nbsp;
    <button onclick="deleteAll();">批量删除</button>
    <form id="delete" action="deteleByIds.do" method="post">
        <input type="hidden" name="choose" value="7">
        <table class="table table-striped">
            <tr>
                <td><input type="checkbox"
                           onclick="changecheckBox(this.checked);"></td>
                <td>姓名</td>
                <td>岗位</td>
                <td>工资</td>
                <td>部门</td>
                <td>详情</td>
                <td>删除</td>
                <td>修改</td>
            </tr>
            <c:forEach items="${pageInfo.list}" var="emp">
                <tr>
                    <td><input type="checkbox" name="empid"
                               value="${emp.empid }"></td>
                    <td>${emp.empname }</td>
                    <td>${emp.empjob }</td>
                    <td>${emp.empwages }</td>
                    <td>${emp.dept.deptname}</td>

                    <td><a href="detail.do?empid=${emp.empid }">详情</a></td>
                    <td><a href="delete.do?empid=${emp.empid }" onclick="return deletebyId()">删除</a></td>
                    <td><a href="toupdate.do?empid=${emp.empid }">修改</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="9"><a href="javascript:doPage(1);">首页</a>&nbsp;&nbsp;
                    <a href="javascript:doPage(${pageInfo.pageNum-1});">上一页</a>&nbsp;&nbsp;
                    <a href="javascript:doPage(${pageInfo.pageNum+1});">下一页</a>&nbsp;&nbsp;
                    <a href="javascript:doPage(${pageInfo.pages});">末页</a>&nbsp;&nbsp;
                    ${pageInfo.pageNum}/${pageInfo.pages}页</td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
