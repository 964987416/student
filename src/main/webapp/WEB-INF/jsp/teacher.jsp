<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>教师页面</title>
<style>
</style>
</head>
<body>
		<!-- 学生  -->
	<form action="user/SelectUserName" method="post">

		根据用户名查询学生信息： <input type="text" name="UserName"> <input
			type="submit" value="查询">
	</form>

	
	<form action="user/DeleteUserByUserName" method="post">

		根据用户名删除学生： <input type="text" name="UserName"><input
			type="submit" value="删除">
	</form>
	学生注册
	<form action="user/InsertUser" method="post">

		用户名<input type="text" name="UserName"><br> 密码<input
			type="password" name="Password"> <br>学号<input
			type="number" name="XueHao"> <br>性别<input type="text"
			name="Gender"><br>籍贯<input type="text" name="JiGuan">
		<br>年龄<input type="number" name="Age"><br> 手机 <input
			type="text" name="Telephone"> <br>备注 <input type="text"
			name="BeiZhu"> <br> <input type="submit" value="注册">

	</form>
	更改学生信息
	<form action="user/UpdateUser" method="post">
		id<input type="number" name="ID"> <br>用户名<input type="text"
			name="UserName"> <br>密码<input type="password"
			name="Password"> <br>学号<input type="number" name="XueHao">
		<br>性别<input type="text" name="Gender"> <br>籍贯<input
			type="text" name="JiGuan"> <br>年龄<input type="number"
			name="Age"> <br>手机 <input type="text" name="Telephone">
		<br>备注 <input type="text" name="BeiZhu"> <br> <input
			type="submit" value="更改">
	</form>

	<form action="user/SelectStudent" method="post">
		<input type="submit" value="查看所有学生信息">
	</form>
	<!-- 留言 -->
	<form action="user/SelectLiuYan" method="post">
		<input type="submit" value="查询所有留言">
	</form>
	<form action="user/AddLiuYan" method="post">
		<input type="text" name="liuyan"><input type="submit"
			value="留言">
	</form>
	<!-- 教师  -->
	<form action="user/SelectTeacherByUserName" method="post">
		根据用户名查询教师信息：<input type="text" name="UserName"><input
			type="submit" value="查询">
	</form>
	教师注册
	<form action="user/InsertTeacher" method="post">

		用户名<input type="text" name="UserName"><br> 用户代码<input
			type="text" name="UserCode"><br> 密码<input
			type="password" name="Password"> <br> 性别<input
			type="text" name="Gender"><br> 课程<input type="text"
			name="Course"><br> 手机 <input type="text"
			name="Telephone"><br> <input type="submit" value="注册">

	</form>
	教师信息修改
	<form action="user/UpdateTeacher" method="post">
		ID<input type="number" name="ID"><br> 用户名<input type="text"
			name="UserName"><br> 用户代码<input type="text"
			name="UserCode"><br> 密码<input type="password"
			name="Password"> <br> 性别<input type="text" name="Gender"><br>
		课程<input type="text" name="Course"><br> 手机 <input
			type="text" name="Telephone"><br> <input type="submit"
			value="确认修改">
	</form>

	<form action="user/DeleteTeacherByUserName" method="post">

		根据用户名删除教师： <input type="text" name="UserName"><input
			type="submit" value="删除">
	</form>
	<form action="user/SelectAllTeacher" method="post">
		<input type="submit" value="查询所有教师信息">
	</form>
	<!-- 课程 -->
	<form action="user/SelectCourseByCourseCode" method="post">
		通过课程代码查找课程： <input type="text" name="coursecode"><input
			type="submit" value="查询">
	</form>
	新增课程
	<form action="user/AddCourse" method="post">
		课程名称<input type="text" name="coursename"><br> 课程代码<input
			type="text" name="coursecode"><br> <input type="submit"
			value="新增">
	</form>
	课程修改
	<form action="user/UpdateCourse" method="post">
		ID<input type="number" name="ID"><br> 课程名称<input
			type="text" name="coursename"><br> 课程代码<input
			type="text" name="coursecode"><br> <input type="submit"
			value="确认修改">
	</form>

	<form action="user/DeleteCourse" method="post">
		课程名称<input type="text" name="coursename"> <input type="submit"
			value="删除">
	</form>
	<form action="user/SelectChengjiByUsername" method="post">
		输入姓名查询成绩： <input type="text" name="username"><input
			type="submit" value="查询">
	</form>


	添加成绩
	<form action="user/AddChengji"  method="post">
		学生学号<input type="text" name="xuehao"> 学生姓名<input type="text"
			name="username"> 成绩<input type="text" name="chengji">
		课程名称<input type="text" name="coursename"> <input type="submit"
			value="新增">
	</form>
	修改成绩
	<form action="user/UpdateChengji" method="post">
		id<input type="number" name="id"> 课程名称<input type="text"
			name="coursename"> 成绩<input type="text" name="chengji">
		<input type="submit" value="修改">
	</form>
	删除成绩
	<form action="user/DeleteChengji" method="post">
		id<input type="number" name="id"> <input type="submit"
			value="删除">
	</form>

	<form action="user/SelectBanji" method="post">
		输入班级名称查询班级信息： <input type="text" name="banjimingcheng"><input
			type="submit" value="查询">
	</form>

	
	
	

</body>
</html>
