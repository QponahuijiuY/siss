<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<li><a href="sm1.jsp"><input type="button" value="按学号查询" class="button2"/></a></li><br/>
		<li><a href="sm2.jsp"><input type="button" value="按学生姓名查询" class="button1"/></a></li><br/>
		 <li><a href="smadd.jsp"><input type="button" value="添加学生" class="button1"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<form method="post" action="FindById">
	<input type="text" name="id" placeholder="请输入学号" class="text"/>&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询" class="button"/>
</form><br/>
<c:choose><c:when test="${!empty student}">
<table border="1px" cellspacing="1" width="100%">
	<tr>
		<th>学号</th> <th>姓名</th> <th>年级</th>
		<th>所在系</th> <th>班级</th>
	</tr>
	<tr>
		<td>${student.getId()}</td><td>${student.getName()}</td>
		<td>${student.getGrade()}</td><td>${student.getDepartment()}</td>
		<td>${student.getCla()}</td>
	</tr>
	</table></c:when>
	<c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>

</body>
</html>