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
		<li><a href="ListGrade"><input type="button" value="成绩信息" class="button1"/></a></li><br/>
		<li><a href="gradeadd.jsp"><input type="button" value="添加成绩信息" class="button2"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<form action="GradeAdd" method="post">
	<input type="hidden" name="status" value="未完成"/>
	<table>
	<tr><td align="center" width="30%">请填入有关成绩的信息：</td><td>课程号：<input type="text" name="id" class="text1"/>
	课程名：<input type="text" name="name" class="text1"/>
	学分：<input type="text" name="credit" class="text1"/>
	成绩：<input type="text" name="num" class="text1"/>
	任课教师：<input type="text" name="teacher" class="text1"/></td></tr>
	<tr><td align="right" width="30%"><input type="submit" value="确定" class="button"/></td>
	<td><input type="reset" value="重置" class="button"/></td></tr>
</table></form>
</div>
</body>
</html>