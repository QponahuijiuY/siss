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
		<li><a href="ListStudents"><input type="button" value="查询所有学生信息" class="button1"/></a></li><br/>
		<li><a href="sm1.jsp"><input type="button" value="按学号查询" class="button1"/></a></li><br/>
		<li><a href="sm2.jsp"><input type="button" value="按学生姓名查询" class="button1"/></a></li><br/>
		<li><a href="smadd.jsp"><input type="button" value="添加学生" class="button2"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<form action="AddStudent" method="post">
<table style="text-align:left">
	<tr><td align="right" width="30%">学生学号：</td><td><input type="text" name="id" class="text"/></td><tr>
	<tr><td align="right" width="30%">学生姓名：</td><td><input type="text" name="name" class="text"/></td><tr>
	<tr><td align="right" width="30%">年级：</td><td><input type="text" name="grade" class="text"/></td><tr>
	<tr><td align="right" width="30%">所在系：</td><td><input type="text" name="department" class="text"/></td><tr>
	<tr><td align="right" width="30%">班级：</td><td><input type="text" name="cla" class="text"/></td><tr>
	<tr><td align="right" width="30%"><input type="submit" value="确定" class="button"/>&nbsp;&nbsp;&nbsp;</td>
	<td><input type="reset" value="重置" class="button"/></td><tr>
</table></form>
</div>
</body>
</html>