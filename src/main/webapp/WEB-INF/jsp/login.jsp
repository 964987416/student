<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>用户登录</title>
</head>
<body background="images/background.jpg"
	style="background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;">

	<form action="Login" method="get">

		<p>学生登录</p>
		用户名<input type="text" name="UserName">密码 <input
			type="password" name="Password"> <input type="submit"
			value="登录"> 请选择登录身份<select class="INPUT_text" name="userType">
			<option value="0">管理员</option>
			<option value="1">学生</option>
			<option value="2">教师</option>
		</select>

	</form>

</body>
</html>