<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>输入姓名查询学生成绩信息</title>
<link rel="stylesheet" type="text/css" href="css/xueshengadd.css" />
<style type="text/css">
ul
{
list-style-type:none;
margin:0;
padding:0;
}
li
{
display:inline;
}
</style>
</head>

<body>
<div id="head" ></div>
	<ul>
<li><a href="../student/jsp/studentindex.jsp">首页</a></li>
<li><a href="../student/jsp/Selectstudent.jsp">查看学生信息</a></li>
<li><a href="../student/jsp/Updatestudent.jsp">修改学生信息</a></li>
<li><a href="../student/jsp/Selectcourse.jsp">查看课程</a></li>
<li><a href="../student/jsp/Selectchengji.jsp">查看成绩</a></li>
<li><a href="../student/jsp/selectliuyan.jsp">查看留言板</a></li>
<li><a href="../student/login.html">退出登录</a></li>

	</ul>
	<b id="title">输入姓名查询学生成绩信息：</b>
		<hr/>
	<form action="user/SelectChengjiByUsername" method="post">
		 <input type="text" name="username"> &nbsp<input
			type="submit" value="查询">
	</form>
	
	 
</body>
</html>
