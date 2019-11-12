package com.company.pojo;

/**
 * 
 * @author gong
 * @category 办公用品实体类
 */

public class Office {
	/**
	 * 物品编号
	 */
	private int oId;
	/**
	 * 物品名称
	 */
	private String oName;
	/**
	 * 领用状态
	 */
	private int requestStateId;
	/**
	 * 物品类型编号
	 */
	private int officeTypeId;
	/**
	 * 库存
	 */
	private int num;

	private RequestState requestState;
	private OfficeType officeType;

	public Office() {
		super();
	}

	public Office(int oId, String oName, int requestStateId, int officeTypeId, int num) {
		super();
		this.oId = oId;
		this.oName = oName;
		this.requestStateId = requestStateId;
		this.officeTypeId = officeTypeId;
		this.num = num;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public int getRequestStateId() {
		return requestStateId;
	}

	public void setRequestStateId(int requestStateId) {
		this.requestStateId = requestStateId;
	}

	public int getOfficeTypeId() {
		return officeTypeId;
	}

	public void setOfficeTypeId(int officeTypeId) {
		this.officeTypeId = officeTypeId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public RequestState getRequestState() {
		return requestState;
	}

	public void setRequestState(RequestState requestState) {
		this.requestState = requestState;
	}

	public OfficeType getOfficeType() {
		return officeType;
	}

	public void setOfficeType(OfficeType officeType) {
		this.officeType = officeType;
	}

}
