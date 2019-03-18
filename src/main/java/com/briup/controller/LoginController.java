package com.briup.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.model.Alluser;
import com.briup.model.Teacher;
import com.briup.model.User;
import com.briup.service.UserService;

/**
 * @author yyj
 * @version CreateTime：2018年4月4日 下午1:29:40
 * 
 */
@Controller
public class LoginController {
	@Autowired
	private UserService service;

	// 登录功能
	@RequestMapping(value = "/Login", method = { RequestMethod.POST })
	public String Login(HttpServletRequest request,
			@RequestParam("UserName") String UserName,
			@RequestParam("Password") String Password,
			@RequestParam("userType") String userType) {
	/*	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (userType.endsWith("1")) {
			// 学生
			User user = service.Login(UserName);
			if (UserName.equals(user.getUsername())) {
				if (Password.equals(user.getPassword())) {
					System.out.println(df.format(new Date()) + " 学生"
							+ user.getUsername() + " 登录成功");

					return "studentindex";

				} else {
					System.out.println(df.format(new Date()) + "密码错误，请重新输入");
				}
			} else {
				System.out.println(df.format(new Date()) + "用户名不存在，请重新输入");
			}

			return "index";

		}
		if (userType.endsWith("2")) {
			// 教师
			Teacher teacher = service.LoginTeacher(UserName);
			if (UserName.equals(teacher.getUsername())) {
				if (Password.equals(teacher.getPassword())) {
					System.out.println(df.format(new Date()) + " 教师"
							+ teacher.getUsername() + " 登录成功");

					return "teacherindex";

				} else {
					System.out.println(df.format(new Date()) + "密码错误，请重新输入");
				}
			} else {
				System.out.println(df.format(new Date()) + "用户名不存在，请重新输入");
			}

			return "index";
		}
		if (userType.endsWith("0")) {
			// 管理员
			Alluser au = service.LoginAdmin(UserName);
			if (UserName.equals(au.getUsername())) {
				if (Password.equals(au.getPassword())) {
					System.out.println(df.format(new Date()) + " 管理员"
							+ au.getUsername() + " 登录成功");

					return "teacherindex";

				} else {
					System.out.println(df.format(new Date()) + "密码错误，请重新输入");
				}
			} else {
				System.out.println(df.format(new Date()) + "用户名不存在，请重新输入");
			}

			return "index";

		}
		return "Error";
*/	
		
		if(userType.endsWith("1")){
			
			return "studentindex";
			
		}else if(userType.endsWith("2")){
			return "teacherindex";
		}else{
			return "teacherindex";
		}
		
	}
}
