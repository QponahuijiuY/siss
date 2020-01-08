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
		<li><a href="ListTest"><input type="button" value="查询所有考试信息" class="button2"/></a></li><br/>
		<li><a href="tm1.jsp"><input type="button" value="按考试编号查询" class="button1"/></a></li><br/>
		<li><a href="tm2.jsp"><input type="button" value="按考试名称查询" class="button1"/></a></li><br/>
		<li><a href="tmadd.jsp"><input type="button" value="添加考试" class="button1"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<c:choose><c:when test="${!empty list}">
<table border="1px" cellspacing="1" width="100%">
	<tr>
		<th>考试编号</th> <th>监考老师</th> <th>考试名称</th>
		<th>班级名称</th> <th>考试时间</th> <th>考试地点</th>
	</tr>
	<c:forEach var="test" items="${list}">
	<tr>
		<td>${test.id}</td><td>${test.teacher}</td>
		<td>${test.course}</td><td>${test.className}</td>
		<td>${test.testTime}</td><td>${test.place}</td>
	</tr></c:forEach>
	</table></c:when>
	<c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>