package com.briup.model; 

import java.util.Date;

/** 
 * @author yyj 
 * @version CreateTime：2018年3月12日 上午9:38:14 
 * 
 */
public class Alluser {
	private long id;
	private String username;
	private String password;
	private String quanxian;
	private Date createdate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuanxian() {
		return quanxian;
	}
	public void setQuanxian(String quanxian) {
		this.quanxian = quanxian;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Biguser [id=" + id + ", username=" + username + ", password="
				+ password + ", quanxian=" + quanxian + ", createdate="
				+ createdate + "]";
	}
	public Alluser(long id, String username, String password, String quanxian,
			Date createdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.quanxian = quanxian;
		this.createdate = createdate;
	}
	public Alluser() {}
	
	

}
 