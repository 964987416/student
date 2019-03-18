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

	<form action="user/UpdateUser" method="post">
		<b id="title">修改学生信息:</b>
		<hr/>
		<br>
		<br>
		<table width="80%" border="1" align="center" cellpadding="3"
			cellspacing="1" bordercolor="#000000"
			style="border-collapse: collapse">
			
			<tr>
				<td>ID：</td>
				<td><input type="text" name="ID"> </td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input
			type="text" name="UserName"></td>
			</tr>
			<tr>
				<td>学号：</td>
				<td><input
			type="text" name="XueHao"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input
			type="password" name="Password"> </td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input name='Age' type="text" /></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input name="Gender" type="radio" value="男" checked>
					男 <input type="radio" name="Gender" value="女"> 女</td>
			</tr>
			<tr>
				<td>出生年月：</td>
				<td><input name='Birthday' type="text" /></td>
			</tr>
			
			<tr>
				<td>籍贯：</td>
				<td>
					<input name='JiGuan' type="text" />
				</td>
			</tr>

			<tr>
				<td>电话：</td>
				<td><input name='Telephone' type='text' value='' /></td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><textarea name="BeiZhu" cols="50" rows="8" id="beizhu"></textarea></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="提交" /> <input type="reset"
					value="重置" /></td>
			</tr>
		</table>
	</form>
	
	 
</body>
</html>
