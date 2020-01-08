<%--
  Created by IntelliJ IDEA.
  User: Mutong
  Date: 2020/1/7
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html; charset=utf-8" language="java"
          pageEncoding="utf-8"%><!DOCTYPE html>
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
        <li><a href="ListGuestbook"><input type="button" value="所有留言信息" class="button1"/></a></li><br/>
        <li><a href="textadd.jsp"><input type="button" value="新建留言" class="button2"/></a></li><br/>
    </ul>
</div>
<div class="bg2">
    <form action="GuestbookAdd" method="post">
        <table>
            <tr><td align="right" width="30%">姓名：</td><td><input type="text" name="name" class="text"/></td></tr>
            <tr><td align="right" width="30%">手机号码：</td><td><input type="text" name="tel" class="text"/></td></tr>
            <tr><td align="right" width="30%">留言：</td><td><textarea rows="5" cols="30" name="text" class="text2"></textarea></td></tr>
            <tr><td align="right" width="30%"><input type="submit" value="提交" class="button"/></td>
                <td><input type="reset" value="重置" class="button"/></td></tr>
        </table></form>
</div>
</body>
</html>