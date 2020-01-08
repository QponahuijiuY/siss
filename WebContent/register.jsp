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
		background-size:cover;
		background-position: center 0;
	}
	.c2{padding:10px;
		width:400px;height:auto;
		background-color:skyblue;
		position:absolute;
		left:65%;top:30%;
		text-align:center;
		border-radius:10px;
		filter:opacity(0.9);
	}
	.login-button { /* 按钮美化 */
	width: 100px; /* 宽度 */
	height: 30px; /* 高度 */
	border-width: 0px; /* 边框宽度 */
	border-radius: 10px; /* 边框半径 */
	background: lawngreen; /* 背景颜色 */
	cursor: pointer; /* 鼠标移入按钮范围时出现手势 */
	outline: none; /* 不显示轮廓线 */
	font-family: Microsoft YaHei; /* 设置字体 */
	color: black; /* 字体颜色 */
	font-size: 14px; /* 字体大小 */
	margin-bottom:10px;
	}
	.login-button:hover{background-color:#5599ff;
	}
	.text{
	margin:5px;outline: none;
	width:200px;height:20px;
	border-radius:10px;
	}
</style>
</head>
<body>
<div>
<img src="img/cover1.jpg" class="c1"/></div>
<div class="c2">
	<form action="RegisterServlet">
	<div><h3 style="color:black;">学生信息管理系统</h3></div>
	<div><input type="text" name="username" size="20" placeholder="用户名" class="text"/></div>
	<div><input type="password" name="psd1" size="20" placeholder="密码" class="text"/></div>
	<div><input type="password" name="psd2" size="20" placeholder="确认密码" class="text"/></div>
	<div><input type="submit" value="注册" class="login-button"/>&nbsp;&nbsp;&nbsp;
	<a href="login.jsp"><input type="button" value="返回" class="login-button"/></a></div>
	</form>
</div>
</body>
</html>