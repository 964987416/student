package com.briup.model; 


/** 
 * @author yyj 
 * @version CreateTime：2018年3月8日 下午4:30:57 
 * 
 */
public class Teacher {
	private long id;
	private String username;
	private String usercode;
	private	String password;
	private String gender;
	private String createdate;
	private String updatedate;
	private String course;
	private String telephone;
	private String birthday;
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
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", username=" + username + ", usercode="
				+ usercode + ", password=" + password + ", gender=" + gender
				+ ", createdate=" + createdate + ", updatedate=" + updatedate
				+ ", course=" + course + ", telephone=" + telephone
				+ ", birthday=" + birthday + "]";
	}
	public Teacher(long id, String username, String usercode, String password,
			String gender, String createdate, String updatedate, String course,
			String telephone, String birthday) {
		super();
		this.id = id;
		this.username = username;
		this.usercode = usercode;
		this.password = password;
		this.gender = gender;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.course = course;
		this.telephone = telephone;
		this.birthday = birthday;
	}
	public Teacher() {}
	
	


	
	

}
 