<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>教师界面</title>

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
<li><a href="../student/jsp/teacherindex.jsp">首页</a></li>
<li><a href="../student/jsp/SelectstudentT.jsp">查看学生信息</a></li>
<li><a href="../student/jsp/Addstudent.jsp">添加学生信息</a></li>
<li><a href="../student/jsp/UpdatestudentT.jsp">修改学生信息</a></li>
<li><a href="../student/jsp/DeletestudentT.jsp">删除学生信息</a></li>
<li><a href="../student/jsp/SelectAllstudentT.jsp">查询所有学生信息</a></li>
<li><a href="../student/jsp/SelectcourseT.jsp">查看课程</a></li>
<li><a href="../student/jsp/SelectchengjiT.jsp">查看成绩</a></li>
<li><a href="../student/jsp/AddchengjiT.jsp">添加学生成绩信息</a></li>
<li><a href="../student/jsp/UpdatechengjiT.jsp">修改学生成绩信息</a></li>
<li><a href="../student/jsp/selectliuyanT.jsp">查看留言板</a></li>
<li><a href="../student/jsp/AddLiuyanT.jsp">留言</a></li>
<li><a href="../student/jsp/SelectteacherT.jsp">查看教师信息</a></li>
<li><a href="../student/jsp/UpdateteacherT.jsp">修改教师信息</a></li>
<li><a href="../student/login.html">退出登录</a></li>
</ul>
	<b id="title">查询所有学生信息:</b>
		<hr/>
	<form action="user/SelectStudent" method="post">
		<input type="submit" value="查询所有学生信息">
	</form>
	
	 
</body>
</html>
