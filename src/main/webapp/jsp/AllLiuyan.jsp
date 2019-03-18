<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>留言板</title>
</head>
<body>
	<center>
		<h1>留言板</h1>
		<table width="400px" border="1px">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">留言</th>
				<th scope="col">创建时间</th>
			</tr>
			<c:forEach items="${list}" var="liuyan">
				<tr>
					<td>${liuyan.id}</td>
					<td>${liuyan.liuyan}</td>
					<td>${liuyan.createdate}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>