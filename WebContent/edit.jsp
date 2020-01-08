<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/page.css">
</head>
<body>
<%@include file="head.jsp" %>
<div class="bg1">
	<ul>
		<li><a href="ListTest"><input type="button" value="查询所有考试信息" class="button1"/></a></li><br/>
		<li><a href="tm1.jsp"><input type="button" value="按考试编号查询" class="button1"/></a></li><br/>
		<li><a href="tm2.jsp"><input type="button" value="按考试名称查询" class="button1"/></a></li><br/>
		<li><a href="tmadd.jsp"><input type="button" value="添加考试" class="button1"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<form method="post" action="EditTest2">
<table>
	<tr><td align="right" width="30%">考试编号：</td><td><input type="text" name="id" value="${test.getId()}" class="text"/></td></tr>
	<tr><td align="right" width="30%">监考老师：</td><td><input type="text" name="teacher" value="${test.getTeacher()}" class="text"/></td></tr>
	<tr><td align="right" width="30%">考试名称：</td><td><input type="text" name="course" value="${test.getCourse()}" class="text"/></td></tr>
	<tr><td align="right" width="30%">班级名称：</td><td><input type="text" name="className" value="${test.getClassName()}" class="text"/></td></tr>
	<tr><td align="right" width="30%">考试时间：</td><td><input type="text" name="testTime" value="${test.getTestTime()}" class="text"/></td><tr>
	<tr><td align="right" width="30%">考试地点：</td><td><input type="text" name="place" value="${test.getPlace()}" class="text"/></td><tr>
	<tr><td align="right" width="30%"><input type="submit" value="确认修改" class="button"/></td>
	<td><input type="reset" value="重置" class="button"/></td></tr>
</table></form>
</div>
</body>
</html>