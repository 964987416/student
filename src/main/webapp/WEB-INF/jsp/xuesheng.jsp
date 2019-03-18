<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生界面</title>
</head>
<body>
	<form action="user/SelectUserName" method="post">


		根据用户名查询学生信息： <input type="text" name="UserName"><br> <input
			type="submit" value="查询">
	</form>
	<br>
	<form action="user/SelectLiuYan" method="post">
		<input type="submit" value="查询所有留言">
	</form>
	
	 
</body>
</html>
