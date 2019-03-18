package com.briup.controller;

/** 
 * @author yyj 
 * @version CreateTime：2018年3月7日 下午4:52:51 
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.model.Alluser;
import com.briup.model.Banji;
import com.briup.model.Chengji;
import com.briup.model.Kecheng;
import com.briup.model.Liuyan;
import com.briup.model.Teacher;
import com.briup.model.User;
import com.briup.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
		
	// 根据学生姓名搜索学生信息
	@RequestMapping(value = "/SelectUserName", method = { RequestMethod.POST })
	@ResponseBody
	public User SelectUserName(@RequestParam(value = "UserName") String UserName) {

		User user = service.SelectUserName(UserName);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (user != null) {
			
			System.out.println(df.format(new Date()) + " 查询学生信息成功");
			return user;
		} else {
			System.out.println(df.format(new Date()) + " 查询学生信息失败：学生姓名不存在");
		}

		return user;
	}

	// 根据学生姓名删除学生
	@RequestMapping(value = "/DeleteUserByUserName", method = RequestMethod.POST)
	@ResponseBody
	public void deleteUserByUserName(String UserName) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.deleteUserByUserName(UserName);
			System.out.println(df.format(new Date()) + "删除用户姓名成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "删除用户姓名失败");
			e.printStackTrace();
		}

	}

	// 学生注册
	@RequestMapping(value = "/InsertUser", method = RequestMethod.POST)
	@ResponseBody
	public void insertUser(@Param(value = "UserName") String UserName,
			@Param(value = "Password") String Password,
			@Param(value = "XueHao") long XueHao,
			@Param(value = "Gender") String Gender,
			@Param(value = "Age") long Age,
			@Param(value = "Telephone") String Telephone,
			@Param(value = "BeiZhu") String BeiZhu,
			@Param(value = "Birthday" )String Birthday,
			@Param(value = "Province" )String Province,
			@Param(value = "City" )String City,
			@Param(value = "Town" )String Town
			) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		User u = new User();
		Date d = new Date();
		String s="";
		s = Province+"-"+City+"-"+Town;
		u.setUsername(UserName);
		u.setPassword(Password);
		u.setXuehao(XueHao);
		u.setGender(Gender);
		u.setJiguan(s);
		u.setAge(Age);
		u.setTelephone(Telephone);
		u.setCreateDate(df.format(d));
		u.setBeizhu(BeiZhu);
		u.setBirthday(Birthday);
	
		try {
			service.insertUser(u);
			System.out.println(df.format(new Date()) + "插入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 更改学生信息
	@RequestMapping(value = "/UpdateUser", method = RequestMethod.POST)
	@ResponseBody
	public void updateUser(@Param(value = "ID") long ID,
			@Param(value = "UserName") String UserName,
			@Param(value = "Password") String Password,
			@Param(value = "XueHao") long XueHao,
			@Param(value = "Gender") String Gender,
			@Param(value = "JiGuan") String JiGuan,
			@Param(value = "Age") long Age,
			@Param(value = "Telephone") String Telephone,
			@Param(value = "BeiZhu") String BeiZhu,
			@Param(value = "Birthday" )String Birthday
			) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		User u = new User();
		Date d = new Date();
		u.setId(ID);
		u.setUsername(UserName);
		u.setPassword(Password);
		u.setXuehao(XueHao);
		u.setGender(Gender);
		u.setJiguan(JiGuan);
		u.setAge(Age);
		u.setTelephone(Telephone);
		u.setUpdateDate(df.format(d));
		u.setBeizhu(BeiZhu);
		u.setBirthday(Birthday);
		
		try {
			service.updateUser(u);
			System.out.println(df.format(new Date()) + "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 查看所有学生
	@RequestMapping(value = "/SelectStudent", method = RequestMethod.POST)
	public String selectStudent(HttpServletRequest request) {

		List<User> list = service.selectStudent();
		request.setAttribute("list", list);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()) + " 所有学生信息查看成功");
		return "AllStudent";
	}

	// 查看所有留言
	@RequestMapping(value = "/SelectLiuYan", method = RequestMethod.POST)
	public String SelectLiuYan(HttpServletRequest request) {

		List<Liuyan> list = service.SelectLiuYan();
		
		request.setAttribute("list", list);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()) + " 留言板查看成功");
		return "AllLiuyan";
	}

	// 留言功能
	@RequestMapping(value = "/AddLiuYan", method = RequestMethod.POST)
	@ResponseBody
	public void addLiuYan(@Param(value = "liuyan") String liuyan) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Liuyan L = new Liuyan();
		Date d = new Date();
		
		L.setLiuyan(liuyan);
		L.setCreatedate(df.format(d));
		service.addLiuyan(L);
		System.out.println(df.format(new Date()) + "添加留言成功");
	}


	// 查询teacher信息
	@RequestMapping(value = "/SelectTeacherByUserName", method = { RequestMethod.POST })
	@ResponseBody
	public Teacher SelectTeacherByUserName(
			@RequestParam("UserName") String UserName) {

		Teacher teacher = service.SelectTeacherByUserName(UserName);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (teacher != null) {

			System.out.println(df.format(new Date()) + " 查询教师信息成功");

			return teacher;
		} else {
			System.out.println(df.format(new Date()) + " 查询教师信息失败：教师姓名不存在");
		}

		return teacher;
	}

	// 教师注册
	@RequestMapping(value = "/InsertTeacher", method = RequestMethod.POST)
	@ResponseBody
	public void insertTeacher(@Param(value = "UserName") String UserName,
			@Param(value = "Password") String Password,
			@Param(value = "UserCode") String UserCode,
			@Param(value = "Gender") String Gender,
			@Param(value = "Course") String Course,
			@Param(value = "Telephone") String Telephone,
			@Param(value = "Birthday") String Birthday) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		Teacher t = new Teacher();
		t.setUsername(UserName);
		t.setUsercode(UserCode);
		t.setPassword(Password);
		t.setGender(Gender);
		t.setCourse(Course);
		t.setTelephone(Telephone);
		t.setCreatedate(df.format(d));
		t.setBirthday(Birthday);
		
		try {
			service.insertTeacher(t);
			System.out.println(df.format(new Date()) + "插入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 教师信息修改
	@RequestMapping(value = "/UpdateTeacher", method = RequestMethod.POST)
	@ResponseBody
	public void updateTeacher(@Param(value = "ID") long ID,
			@Param(value = "UserName") String UserName,
			@Param(value = "Password") String Password,
			@Param(value = "UserCode") String UserCode,
			@Param(value = "Gender") String Gender,
			@Param(value = "Course") String Course,
			@Param(value = "Telephone") String Telephone,
			@Param(value = "Birthday") String Birthday) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Teacher t = new Teacher();
		Date d = new Date();
		t.setId(ID);
		t.setUsername(UserName);
		t.setPassword(Password);
		t.setUsercode(UserCode);
		t.setCourse(Course);
		t.setGender(Gender);
		t.setTelephone(Telephone);
		t.setUpdatedate(df.format(d));
		t.setBirthday(Birthday);
		
		try {
			service.updateTeacher(t);
			System.out.println(df.format(new Date()) + "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 根据教师姓名删除教师
	@RequestMapping(value = "/DeleteTeacherByUserName", method = RequestMethod.POST)
	@ResponseBody
	public void deleteTeacherByUserName(String UserName) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.deleteTeacherByUserName(UserName);
			System.out.println(df.format(new Date()) + "删除用户姓名成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "删除用户姓名失败");
			e.printStackTrace();
		}

	}

	// 查看所有教师
	@RequestMapping(value = "/SelectAllTeacher", method = RequestMethod.POST)
	public String selectAllTeacher(HttpServletRequest request) {

		List<Teacher> list = service.selectAllTeacher();
		request.setAttribute("list", list);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()) + " 所有教师信息查看成功");
		return "AllTeacher";
	}

	// 根据根据课程代码搜索课程
	@RequestMapping(value = "/SelectCourseByCourseCode", method = { RequestMethod.POST })
	@ResponseBody
	public Kecheng selectCourseByCourseCode(
			@RequestParam("coursecode") String coursecode) {

		Kecheng kecheng = service.selectCourseByCourseCode(coursecode);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (kecheng != null) {

			System.out.println(df.format(new Date()) + " 查询课程成功");

			return kecheng;
		} else {
			System.out.println(df.format(new Date()) + " 查询课程失败：课程不存在");
		}

		return kecheng;
	}

	// 修改课程
	@RequestMapping(value = "/UpdateCourse", method = RequestMethod.POST)
	@ResponseBody
	public void updateCourse(@Param(value = "ID") long ID,
			@Param(value = "coursename") String coursename,
			@Param(value = "coursecode") String coursecode) {

		Kecheng k = new Kecheng();
		k.setId(ID);
		k.setCoursecode(coursecode);
		k.setCoursename(coursename);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.updateCourse(k);
			System.out.println(df.format(new Date()) + "修改成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "修改失败");

			e.printStackTrace();
		}

	}

	// 新增课程
	@RequestMapping(value = "/AddCourse", method = RequestMethod.POST)
	@ResponseBody
	public void addCourse(@Param(value = "coursename") String coursename,
			@Param(value = "coursecode") String coursecode) {

		Kecheng k = new Kecheng();
		Date d = new Date();
		k.setCreatedate(d);
		k.setCoursecode(coursecode);
		k.setCoursename(coursename);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.addCourse(k);
			System.out.println(df.format(new Date()) + "添加成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "添加失败");
			e.printStackTrace();
		}

	}

	// 删除课程
	@RequestMapping(value = "/DeleteCourse", method = RequestMethod.POST)
	@ResponseBody
	public void deleteCourse(@RequestParam("coursename") String coursename) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.DeleteCourse(coursename);
			System.out.println(df.format(new Date()) + "删除课程成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "删除课程失败");
			e.printStackTrace();
		}

	}

	// 根据学生姓名查询学生成绩
	@RequestMapping(value = "/SelectChengjiByUsername", method = { RequestMethod.POST })
	@ResponseBody
	public Chengji SelectChengjiByUsername(
			@RequestParam("username") String username) {

		Chengji c = service.SelectChengjiByUsername(username);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (c != null) {

			System.out.println(df.format(new Date()) + " 查询学生成绩成功");

			return c;
		} else {
			System.out.println(df.format(new Date()) + " 查询学生成绩失败");
		}

		return c;
	}

	// 新增成绩
	@RequestMapping(value = "/AddChengji", method = RequestMethod.POST)
	@ResponseBody
	public void addChengji(@Param(value = "xuehao") Long xuehao,
			@Param(value = "username") String username,
			@Param(value = "chengji") String chengji,
			@Param(value = "coursename") String coursename

	) {

		Chengji c = new Chengji();
		Date d = new Date();
		c.setUsername(username);
		c.setCreatedate(d);
		c.setXuehao(xuehao);
		c.setChengji(chengji);
		c.setCoursename(coursename);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.addChengji(c);
			System.out.println(df.format(new Date()) + "添加成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "添加失败");
			e.printStackTrace();
		}

	}

	// 修改成绩
	@RequestMapping(value = "/UpdateChengji", method = RequestMethod.POST)
	@ResponseBody
	public void updateChengji(@Param(value = "id") long id,
			@Param(value = "chengji") String chengji,
			@Param(value = "coursename") String coursename

	) {

		Chengji c = new Chengji();
		c.setId(id);
		c.setChengji(chengji);
		c.setCoursename(coursename);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.updateChengji(c);
			System.out.println(df.format(new Date()) + "修改成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "修改失败");
			e.printStackTrace();
		}

	}

	// 删除成绩
	@RequestMapping(value = "/DeleteChengji", method = RequestMethod.POST)
	@ResponseBody
	public void DeleteChengji(@RequestParam("id") long id) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.DeleteChengji(id);
			System.out.println(df.format(new Date()) + "删除成绩成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "删除成绩失败");
			e.printStackTrace();
		}

	}

	// 根据班级名称查找班级信息
	@RequestMapping(value = "/SelectBanji", method = { RequestMethod.POST })
	@ResponseBody
	public Banji SelectBanji(
			@RequestParam("banjimingcheng") String banjimingcheng) {

		Banji banji = service.SelectBanji(banjimingcheng);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (banji != null) {

			System.out.println(df.format(new Date()) + " 查询学生成绩成功");

			return banji;
		} else {
			System.out.println(df.format(new Date()) + " 查询学生成绩失败");
		}

		return banji;
	}

	// 修改班级信息
	@RequestMapping(value = "/UpdateBanji", method = RequestMethod.POST)
	@ResponseBody
	public void updateBanji(@Param(value = "id") long id,
			@Param(value = "banjimingcheng") String banjimingcheng,
			@Param(value = "xueyuan") String xueyuan,
			@Param(value = "banzhuren") String banzhuren

	) {

		Banji banji = new Banji();
		banji.setId(id);
		banji.setbanjimingcheng(banjimingcheng);
		banji.setXueyuan(xueyuan);
		banji.setBanzhuren(banzhuren);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.updateBanji(banji);
			System.out.println(df.format(new Date()) + "修改成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "修改失败");
			e.printStackTrace();
		}

	}

	// 新增班级信息
	@RequestMapping(value = "/AddBanji", method = RequestMethod.POST)
	@ResponseBody
	public void addBanji(
			@Param(value = "banjimingcheng") String banjimingcheng,
			@Param(value = "xueyuan") String xueyuan,
			@Param(value = "banzhuren") String banzhuren) {

		Banji banji = new Banji();
		Date d = new Date();
		banji.setbanjimingcheng(banjimingcheng);
		banji.setXueyuan(xueyuan);
		banji.setBanzhuren(banzhuren);
		banji.setCreateDate(d);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.addBanji(banji);
			System.out.println(df.format(new Date()) + "添加成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "添加失败");
			e.printStackTrace();
		}

	}

	// 删除班级
	@RequestMapping(value = "/DeleteBanji", method = RequestMethod.POST)
	@ResponseBody
	public void deleteBanji(
			@RequestParam("banjimingcheng") String banjimingcheng) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.deleteBanji(banjimingcheng);
			System.out.println(df.format(new Date()) + "删除班级成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "删除班级失败");
			e.printStackTrace();
		}

	}

	// 输入用户姓名查询用户权限
	@RequestMapping(value = "/SelectUser", method = { RequestMethod.POST })
	@ResponseBody
	public Alluser SelectUser(@RequestParam("username") String username) {

		Alluser au = service.SelectUser(username);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (au != null) {

			System.out.println(df.format(new Date()) + " 查询学生成绩成功");

			return au;
		} else {
			System.out.println(df.format(new Date()) + " 查询学生成绩失败");
		}

		return au;
	}

	// 新增权限用户
	@RequestMapping(value = "/AddUser", method = RequestMethod.POST)
	@ResponseBody
	public void addUser(@Param(value = "username") String username,
			@Param(value = "password") String password,
			@Param(value = "quanxain") String quanxian) {

		Alluser au = new Alluser();
		Date d = new Date();
		au.setUsername(username);
		au.setPassword(password);
		au.setQuanxian(quanxian);
		au.setCreatedate(d);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			service.addUser(au);
			System.out.println(df.format(new Date()) + "添加成功");
		} catch (Exception e) {
			System.out.println(df.format(new Date()) + "添加失败");
			e.printStackTrace();
		}

	}
	// 修改权限用户信息
		@RequestMapping(value = "/UpdateQuanXianUser", method = RequestMethod.POST)
		@ResponseBody
		public void updateQuanXianUser(@Param(value = "id") long id,
				@Param(value = "username") String username,
				@Param(value = "password") String password,
				@Param(value = "quanxian") String quanxian

		) {

			Alluser	au = new Alluser();
			au.setId(id);
			au.setUsername(username);
			au.setPassword(password);
			au.setQuanxian(quanxian);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				service.updateQuanXianUser(au);
				System.out.println(df.format(new Date()) + "修改成功");
			} catch (Exception e) {
				System.out.println(df.format(new Date()) + "修改失败");
				e.printStackTrace();
			}

		}
		// 删除成绩
		@RequestMapping(value = "/DeletequanxianUser", method = RequestMethod.POST)
		@ResponseBody
		public void DeletequanxianUser(
				@RequestParam("username") String username) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				service.DeletequanxianUser(username);
				System.out.println(df.format(new Date()) + "删除用户成功");
			} catch (Exception e) {
				System.out.println(df.format(new Date()) + "删除用户失败");
				e.printStackTrace();
			}

		}
		
}
