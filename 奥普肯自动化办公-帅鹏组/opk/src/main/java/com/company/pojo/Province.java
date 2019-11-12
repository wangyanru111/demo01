package com.company.pojo;

/**
 * @author ZH
 * @category 省份实体类
 */
public class Province {
	
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 省份ID
	 */
	private int provinceID;
	/**
	 * 省份名称
	 */
	private String province;
	
	
	
	public Province() {
		super();
	}



	public Province(int id, int provinceID, String province) {
		super();
		this.id = id;
		this.provinceID = provinceID;
		this.province = province;
	}



	public Province(int provinceID, String province) {
		super();
		this.provinceID = provinceID;
		this.province = province;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getProvinceID() {
		return provinceID;
	}



	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}
	
	
}
