package com.briup.service;

import java.util.List;

import com.briup.model.Alluser;
import com.briup.model.Banji;
import com.briup.model.Chengji;
import com.briup.model.Kecheng;
import com.briup.model.Liuyan;
import com.briup.model.Teacher;
import com.briup.model.User;

/**
 * @author yyj
 * @version CreateTime：2018年3月7日 下午4:53:50
 * 
 */
public interface UserService {

	public User SelectUserName(String UserName);

	public List<Liuyan> SelectLiuYan();

	public Teacher SelectTeacherByUserName(String UserName);

	public User Login(String UserName);

	public void deleteUserByUserName(String UserName);

	public void insertUser(User u);

	public void updateUser(User u);

	public void addLiuyan(Liuyan L);

	public void insertTeacher(Teacher t);

	public void updateTeacher(Teacher t);

	public void deleteTeacherByUserName(String UserName);

	public List<User> selectStudent();

	public List<Teacher> selectAllTeacher();

	public Kecheng selectCourseByCourseCode(String coursecode);

	public void updateCourse(Kecheng k);

	public void addCourse(Kecheng k);

	public void DeleteCourse(String coursename);

	public Chengji SelectChengjiByUsername(String username);

	public void addChengji(Chengji c);

	public void updateChengji(Chengji c);

	public void DeleteChengji(long id);

	public Banji SelectBanji(String banjimingcheng);

	public void updateBanji(Banji banji);

	public void addBanji(Banji banji);

	public void deleteBanji(String banjimingcheng);

	public Alluser SelectUser(String username);

	public void addUser(Alluser au);

	public void updateQuanXianUser(Alluser au);

	public void DeletequanxianUser(String username);

	public Teacher LoginTeacher(String userName);

	public Alluser LoginAdmin(String userName);




}
