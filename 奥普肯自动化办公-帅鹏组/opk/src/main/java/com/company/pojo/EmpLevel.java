package com.company.pojo;

public class EmpLevel {

	/**
	 * 职级编号
	 */
	private int lId;
	/**
	 * 职级
	 */
	private String level;

	public EmpLevel(int lId, String level) {
		super();
		this.lId = lId;
		this.level = level;
	}

	public EmpLevel() {
		super();
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
