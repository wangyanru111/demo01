package com.company.pojo;

/**
 * @author ZH
 * @category 部门实体类
 */
public class Dept {

	/**
	 * 部门编号
	 */
	private int dId;
	/**
	 * 部门名称
	 */
	private String dName;
	
	public Dept() {
		super();
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	
}
