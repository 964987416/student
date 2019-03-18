package com.briup.model; 

import java.util.Date;

/** 
 * @author yyj 
 * @version CreateTime：2018年3月12日 上午9:31:56 
 * 
 */
public class Kecheng {
	private long id;
	private String coursecode;
	private String coursename;
	private Date createdate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Kecheng [id=" + id + ", coursecode=" + coursecode
				+ ", coursename=" + coursename + ", createdate=" + createdate
				+ "]";
	}
	public Kecheng(long id, String coursecode, String coursename,
			Date createdate) {
		super();
		this.id = id;
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.createdate = createdate;
	}
	public Kecheng() {}
	

}
 