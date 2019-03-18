package com.briup.model;


/**
 * @author yyj
 * @version CreateTime：2018年3月7日 下午4:48:21
 * 
 */
public class User {
	private long id;
	private String username;
	private String password;
	private String gender;
	private String jiguan;
	private String beizhu;
	private long age;
	private String telephone;
	private long xuehao;
	private String birthday;
	private String createDate;
	private String updateDate;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJiguan() {
		return jiguan;
	}
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public long getXuehao() {
		return xuehao;
	}
	public void setXuehao(long xuehao) {
		this.xuehao = xuehao;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", gender=" + gender + ", jiguan=" + jiguan
				+ ", beizhu=" + beizhu + ", age=" + age + ", telephone="
				+ telephone + ", xuehao=" + xuehao + ", birthday=" + birthday
				+ ", createDate=" + createDate + ", updateDate=" + updateDate
				+ "]";
	}
	public User(long id, String username, String password, String gender,
			String jiguan, String beizhu, long age, String telephone,
			long xuehao, String birthday, String createDate, String updateDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.jiguan = jiguan;
		this.beizhu = beizhu;
		this.age = age;
		this.telephone = telephone;
		this.xuehao = xuehao;
		this.birthday = birthday;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public User() {}
	
	
	

}
