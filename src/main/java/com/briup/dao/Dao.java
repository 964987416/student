package com.briup.dao;

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
 * @version CreateTime：2018年3月7日 下午4:53:10
 * 
 */
public interface Dao {

	User SelectUserName(String UserName);

	List<Liuyan> SelectLiuYan();

	Teacher SelectTeacherByUserName(String UserName);

	User Login(String UserName);

	void deleteUserByUserName(String UserName);

	void insertUser(User u);

	void updateUser(User u);

	void addLiuyan(Liuyan L);

	void insertTeacher(Teacher t);

	void updateTeacher(Teacher t);

	void deleteTeacherByUserName(String userName);

	List<User> selectStudent();

	List<Teacher> selectAllTeacher();

	Kecheng selectCourseByCourseCode(String coursecode);

	void updateCourse(Kecheng k);

	void addCourse(Kecheng k);

	void DeleteCourse(String coursename);

	Chengji SelectChengjiByUsername(String username);

	void addChengji(Chengji c);

	void updateChengji(Chengji c);

	void DeleteChengji(long id);

	Banji SelectBanji(String banjimingcheng);

	void updateBanji(Banji banji);

	void addBanji(Banji banji);

	void deleteBanji(String banjimingcheng);

	Alluser SelectUser(String username);

	void addUser(Alluser au);

	void updateQuanXianUser(Alluser au);

	void DeletequanxianUser(String username);

	Teacher LoginTeacher(String userName);

	Alluser LoginAdmin(String userName);


}
