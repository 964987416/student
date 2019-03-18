package com.briup.model; 

import java.util.Date;

/** 
 * @author yyj 
 * @version CreateTime：2018年3月12日 上午9:35:11 
 * 
 */
public class Chengji {
	private long id;
	private long xuehao;
	private String username;
	private String coursename;
	private String chengji;
	private Date createdate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getXuehao() {
		return xuehao;
	}
	public void setXuehao(long xuehao) {
		this.xuehao = xuehao;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getChengji() {
		return chengji;
	}
	public void setChengji(String chengji) {
		this.chengji = chengji;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Chengji [id=" + id + ", xuehao=" + xuehao + ", username="
				+ username + ", coursename=" + coursename + ", chengji="
				+ chengji + ", createdate=" + createdate + "]";
	}
	public Chengji(long id, long xuehao, String username, String coursename,
			String chengji, Date createdate) {
		super();
		this.id = id;
		this.xuehao = xuehao;
		this.username = username;
		this.coursename = coursename;
		this.chengji = chengji;
		this.createdate = createdate;
	}
	public Chengji() {}
	

}
 