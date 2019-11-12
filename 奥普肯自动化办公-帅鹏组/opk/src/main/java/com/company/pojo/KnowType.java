package com.company.pojo;

public class KnowType {
	
	/**
	 * 知识类型编号
	 */
	private int knowTypeId;
	/**
	 * 知识类型
	 */
	private String knowType;

	public KnowType(int knowTypeId, String knowType) {
		super();
		this.knowTypeId = knowTypeId;
		this.knowType = knowType;
	}

	public KnowType() {
		super();
	}

	public int getKnowTypeId() {
		return knowTypeId;
	}

	public void setKnowTypeId(int knowTypeId) {
		this.knowTypeId = knowTypeId;
	}

	public String getKnowType() {
		return knowType;
	}

	public void setKnowType(String knowType) {
		this.knowType = knowType;
	}

}
