<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
.bg{
	background-color:white;border-width:2px;border-color:#114092;border-style:groove;
	border-radius:10px;padding:15px;margin:0 5%;
	width:70%;height:200px;float:left;filter:opacity(0.9);
}
.button { /* 按钮美化 */
	width: 150px; /* 宽度 */
	height: 30px; /* 高度 */
	border-width: 0px; /* 边框宽度 */
	border-radius: 10px; /* 边框半径 */
	background: #1E90FF; /* 背景颜色 */
	cursor: pointer; /* 鼠标移入按钮范围时出现手势 */
	outline: none; /* 不显示轮廓线 */
	font-family: Microsoft YaHei; /* 设置字体 */
	color: white; /* 字体颜色 */
	font-size: 14px; /* 字体大小 */
	margin-bottom:10px;
}
.text{
	margin:5px;outline: none;
	width:200px;height:20px;
	border-radius:6px;
}
</style>
<script type="text/javascript">
 function revoke(){
	 if(confirm("确定要注销此账号吗？")){
		 return true;
	 }return false
 }
</script>
</head>
<body>
<%@include file="head.jsp" %>
<div class="bg">
	<form action="AlterServlet?username=${user.username}" method="post">
	<input type="hidden" name="username" value="${user.username}"/>
	旧密码：<input type="password" name="oldpsd" class="text"/><br/>
	新密码：<input type="password" name="newpsd" class="text"/><br/>
	<input type="submit" value="确认修改" class="button"/>
	<a href="RevokeServlet?username=${user.username}" onClick="return revoke();"><input type="button" value="注销账号" class="button"/></a>
</form>
</div>
</body>
</html>