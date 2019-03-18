package com.briup.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.dao.Dao;
import com.briup.model.Alluser;
import com.briup.model.Banji;
import com.briup.model.Chengji;
import com.briup.model.Kecheng;
import com.briup.model.Liuyan;
import com.briup.model.Teacher;
import com.briup.model.User;
import com.briup.service.UserService;

/**
 * @author yyj
 * @version CreateTime：2018年3月7日 下午4:54:13
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private Dao dao;

	@Override
	public User SelectUserName(String UserName) {

		return dao.SelectUserName(UserName);
	}

	@Override
	public List<Liuyan> SelectLiuYan() {

		return dao.SelectLiuYan();
	}

	@Override
	public Teacher SelectTeacherByUserName(String UserName) {

		return dao.SelectTeacherByUserName(UserName);
	}

	@Override
	public User Login(String UserName) {

		return dao.Login(UserName);
	}

	@Override
	public void deleteUserByUserName(String UserName) {
		dao.deleteUserByUserName(UserName);
	}

	@Override
	public void insertUser(User u) {
		dao.insertUser(u);
	}

	@Override
	public void updateUser(User u) {
		dao.updateUser(u);
	}

	@Override
	public void addLiuyan(Liuyan L) {
		dao.addLiuyan(L);

	}

	@Override
	public void insertTeacher(Teacher t) {
		dao.insertTeacher(t);

	}

	@Override
	public void updateTeacher(Teacher t) {
		dao.updateTeacher(t);

	}

	@Override
	public void deleteTeacherByUserName(String UserName) {
		dao.deleteTeacherByUserName(UserName);

	}

	@Override
	public List<User> selectStudent() {
		
		return dao.selectStudent();
	}

	@Override
	public List<Teacher> selectAllTeacher() {
		
		return dao.selectAllTeacher();
	}

	@Override
	public Kecheng selectCourseByCourseCode(String coursecode) {

		return dao.selectCourseByCourseCode(coursecode);
	}

	@Override
	public void updateCourse(Kecheng k) {
		 dao.updateCourse(k);
		
	}

	@Override
	public void addCourse(Kecheng k) {
		dao.addCourse(k);
	}

	@Override
	public void DeleteCourse(String coursename) {
		dao.DeleteCourse(coursename);
		
	}

	@Override
	public Chengji SelectChengjiByUsername(String username) {

		return dao.SelectChengjiByUsername(username);
	}

	@Override
	public void addChengji(Chengji c) {
		dao.addChengji(c);
		
	}

	@Override
	public void updateChengji(Chengji c) {
		dao.updateChengji(c);
		
	}

	@Override
	public void DeleteChengji(long id) {
		dao.DeleteChengji(id);
	}

	@Override
	public Banji SelectBanji(String banjimingcheng) {
		return dao.SelectBanji(banjimingcheng);
	}

	@Override
	public void updateBanji(Banji banji) {
		 dao.updateBanji(banji);
	}

	@Override
	public void addBanji(Banji banji) {
		dao.addBanji(banji);
	}

	@Override
	public void deleteBanji(String banjimingcheng) {
		dao.deleteBanji(banjimingcheng);
	}

	@Override
	public Alluser SelectUser(String username) {
		
		return dao.SelectUser(username);
	}

	@Override
	public void addUser(Alluser au) {

		dao.addUser(au);
	}

	@Override
	public void updateQuanXianUser(Alluser au) {
		dao.updateQuanXianUser(au);
	}

	@Override
	public void DeletequanxianUser(String username) {
		dao.DeletequanxianUser(username);
	}

	@Override
	public Teacher LoginTeacher(String userName) {
		
		return  dao.LoginTeacher( userName);
	}

	@Override
	public Alluser LoginAdmin(String userName) {

		return dao.LoginAdmin(userName);
	}


}
