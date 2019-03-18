<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>教师信息界面</title>
</head>
<body>
	<center>
		<h1>所有教师信息界面</h1>
		<table width="400px" border="1px">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">用户名</th>
				<th scope="col">用户代码</th>
				<th scope="col">密码</th>
				<th scope="col">性别</th>
				<th scope="col">课程</th>
				<th scope="col">电话</th>
				<th scope="col">生日</th>
				<th scope="col">创建日期</th>
				<th scope="col">修改日期</th>
			</tr>
			<c:forEach items="${list}" var="teacher">
				<tr>
					<td>${teacher.id}</td>
					<td>${teacher.username}</td>
					<td>${teacher.usercode}</td>
					<td>${teacher.password}</td>
					<td>${teacher.gender}</td>
					<td>${teacher.course}</td>
					<td>${teacher.telephone}</td>
					<td>${teacher.birthday}</td>
					<td>${teacher.updatedate}</td>
					<td>${teacher.createdate}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>