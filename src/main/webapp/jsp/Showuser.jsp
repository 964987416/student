<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生信息显示页面</title>
</head>
<body>
	<center>
		<h1>学生信息显示页面</h1>
		<table width="400px" border="1px">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">用户名</th>
				<th scope="col">密码</th>
				<th scope="col">学号</th>
				<th scope="col">性别</th>
				<th scope="col">生日</th>
				<th scope="col">籍贯</th>
				<th scope="col">备注</th>
				<th scope="col">年龄</th>
				<th scope="col">电话</th>
				<th scope="col">创建时间</th>
				<th scope="col">修改时间</th>
			</tr>
			
				<tr>
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>${user.xuehao}</td>
					<td>${user.gender}</td>
					<td>${user.birthday}</td>
					<td>${user.jiguan}</td>
					<td>${user.beizhu}</td>
					<td>${user.age}</td>
					<td>${user.telephone}</td>
					<td>${user.createdate}</td>
					<td>${user.updatedate}</td>
				</tr>
			
		</table>
	</center>
</body>
</html>