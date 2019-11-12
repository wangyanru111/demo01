package com.company.pojo;
/**
 * 
 * @author gong
 * @category 项目只是支持实体类
 *
 */

public class Proknow {
	/**
	 * 项目编号
	 */
	private int pId;
	/**
	 * 知识编号
	 */
	private int knowId;

	public Proknow() {
		super();
	}

	public Proknow(int pId, int knowId) {
		super();
		this.pId = pId;
		this.knowId = knowId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getKnowId() {
		return knowId;
	}

	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}

}
