package com.company.pojo;

/**
 * 
 * @author gong
 * @category 物品类型实体类
 */

public class OfficeType {
	/**
	 * 物品类型编号
	 */
	private int officeTypeId;
	/**
	 * 物品类型
	 */
	private String officeType;

	public OfficeType() {
		super();
	}

	public OfficeType(int officeTypeId, String officeType) {
		super();
		this.officeTypeId = officeTypeId;
		this.officeType = officeType;
	}

	public int getofficeTypeId() {
		return officeTypeId;
	}

	public void setofficeTypeId(int officeTypeId) {
		this.officeTypeId = officeTypeId;
	}

	public String getOfficeType() {
		return officeType;
	}

	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

}
