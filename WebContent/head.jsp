<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	.c1{position:fixed;
  		top: 0;
  		left: 0;
  		width:100%;
  		height:100%;
		min-width: 1000px;
  		z-index:-10;
		background-repeat:no-repeat;
		background-size:100% 100%;
		background-position: center 0;
		background-attachment: fixed;
	}
	ul li{display:inline;}
	ul li a{text-decoration: none;}
	a{text-decoration:none;}
	a:link,a:visited,a:hover{color:skyblue;}
	a:active{color:gold;}
	.button{width:auto;height:30px;
			margin:10px;border-width: 0px;background: skyblue;
			cursor: pointer;outline: none;color: white;font-size: 14px;
	}
	.button:hover{background-color:#144CAC;}
</style>
</head>
<body>
<div><img src="img/cover5.jpg" class="c1"/></div>
<div align="right" style="background-color:floralwhite;padding:5px;">
	<a href="useralter.jsp?username=${user.username}">${user.getUsername()}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="LogoutServlet">退出</a>
</div>
<div style="width:100%;height:50px;">
<h1 style="color:royalblue;position:relative;left:5%; text-align:center">学生信息管理系统</h1>
</div>
<div style="background-color:floralwhite ; margin:auto;">
<ul>
	<li><a href="LoginServlet?username=${user.getUsername()}&password=${user.getPassword()}"><input type="button" value="首页" class="button"/></a></li>|
	<li><a href="ListStudents"><input type="button" value="学生信息管理" class="button"/></a></li>|
	<li><a href="ListGrade"><input type="button" value="成绩管理" class="button"/></a></li>|
	<li><a href="ListTest"><input type="button" value="考试管理" class="button"/></a></li>|
	<li><a href="ListGuestbook"><input type="button" value="留言管理" class="button"/></a></li>
</ul></div>
</body>
</html>