package com.briup.model; 


/** 
 * @author yyj 
 * @version CreateTime：2018年3月9日 下午4:03:34 
 * 
 */
public class Liuyan {
	private long id;
	private String liuyan;
	private String createdate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLiuyan() {
		return liuyan;
	}

	public void setLiuyan(String liuyan) {
		this.liuyan = liuyan;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "Liuyan [id=" + id + ", liuyan=" + liuyan + ", createdate="
				+ createdate + "]";
	}

	public Liuyan(long id, String liuyan, String createdate) {
		super();
		this.id = id;
		this.liuyan = liuyan;
		this.createdate = createdate;
	}

	public Liuyan() {}
	
	

}
 