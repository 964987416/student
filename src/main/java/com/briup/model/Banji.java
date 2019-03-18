package com.briup.model; 

import java.util.Date;

/** 
 * @author yyj 
 * @version CreateTime：2018年3月12日 上午9:27:53 
 * 
 */
public class Banji {
	private long id;
	private String banjimingcheng;
	private String xueyuan;
	private String banzhuren;
	private Date createDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getbanjimingcheng() {
		return banjimingcheng;
	}
	public void setbanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	public String getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	public String getBanzhuren() {
		return banzhuren;
	}
	public void setBanzhuren(String banzhuren) {
		this.banzhuren = banzhuren;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Banji [id=" + id + ", banjimingcheng=" + banjimingcheng + ", xueyuan="
				+ xueyuan + ", banzhuren=" + banzhuren + ", createDate="
				+ createDate + "]";
	}
	public Banji(long id, String banjimingcheng, String xueyuan, String banzhuren,
			Date createDate) {
		super();
		this.id = id;
		this.banjimingcheng = banjimingcheng;
		this.xueyuan = xueyuan;
		this.banzhuren = banzhuren;
		this.createDate = createDate;
	}
	public Banji() {}
	

}
 