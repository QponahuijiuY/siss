<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/page.css">
<script type="text/javascript">
function yunxu(){
	if(confirm("确定此成绩录入?")){
		return true;
	}return false;
}
function buyunxu(){
	alert("已完成！")
	return false;
}
</script>
</head>
<body>
<%@include file="head.jsp" %>
<div class="bg1">
	<ul>
		<li><a href="ListGrade"><input type="button" value="成绩信息" class="button2"/></a></li><br/>
		<li><a href="gradeadd.jsp"><input type="button" value="添加成绩信息" class="button1"/></a></li><br/>
	</ul>
</div>
<div class="bg2">
<c:choose><c:when test="${!empty list}">
<table border="1px" cellspacing="1" width="100%">
	<tr>
		<th>课程号</th> <th>课程名</th> <th>学分</th>
		<th>成绩</th> <th>任课老师</th> <th>确定录入</th>
	</tr>
	<c:forEach var="p" items="${list}">
	<tr>
		<td>${p.id }</td>
		<td>${p.name}</td>
		<td>${p.credit}</td><td>${p.num}</td>
		<td>${p.teacher}</td>
		<td><c:if test="${p.status=='未完成'}">
			<a href="GradeAlter?id=${p.id}"  onClick="return yunxu();">
			<img src="./img/22.png" width="20px" height="20px"/></a>
		</c:if><c:if test="${p.status=='已完成'}">
			<a href="GradeAlter?id=${p.id}"  onClick="return buyunxu();">
			<img src="./img/22.png" width="20px" height="20px"/></a>
		</c:if>
		</td>
	</tr></c:forEach>
	</table></c:when>
	<c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>