<%@ page import="cn.itcast.bean.Guestbook" %><%--
  Created by IntelliJ IDEA.
  User: Mutong
  Date: 2020/1/7
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html; charset=utf-8" language="java"
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
        <li><a href="ListGuestbook"><input type="button" value="所有留言信息" class="button2"/></a></li><br/>

        <li><a href="textadd.jsp"><input type="button" value="新建留言" class="button1"/></a></li><br/>
    </ul>
</div>
<div class="bg2">
    <c:choose><c:when test="${!empty list}">
        <table border="1px" cellspacing="1" width="100%">
            <tr>
                <th>姓名</th>
                <th>手机号码</th>
                <th>留言信息</th>
            </tr>
            <c:forEach var="guestbook" items="${list}">
                <tr>
                    <td>${guestbook.name}</td>
                    <td>${guestbook.tel}</td>
                    <td>${guestbook.text}</td>
<%System.out.println();%>
                </tr></c:forEach>
        </table></c:when>
        <c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>
<%--

            <c:forEach var="student" items="${list}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.grade}</td>
                    <td>${student.department}</td>
                    <td>${student.cla}</td>
                    <td>${student.sourceName}</td>
                    <td>${student.score}</td>
                </tr></c:forEach>
        </table></c:when>
        <c:otherwise>没有任何信息！</c:otherwise></c:choose>
</div>
</body>
</html>
--%>