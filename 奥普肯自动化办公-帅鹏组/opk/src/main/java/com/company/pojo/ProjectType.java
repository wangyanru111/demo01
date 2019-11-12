package com.company.pojo;

/**
 * 
 * @author gong
 * @category 项目类型实体类
 *
 */
public class ProjectType {
	/**
	 * 类型编号
	 */
	private int proTid;
	/**
	 * 类型
	 */
	private String proType;

	public ProjectType() {
		super();
	}

	public ProjectType(int proTid, String proType) {
		super();
		this.proTid = proTid;
		this.proType = proType;
	}

	public int getProTid() {
		return proTid;
	}

	public void setProTid(int proTid) {
		this.proTid = proTid;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

}
