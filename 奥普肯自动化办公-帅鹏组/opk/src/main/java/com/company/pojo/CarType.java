package com.company.pojo;

/**
 * @author ZH
 * @category
 */
public class CarType {

	/**
	 * 车辆类型编号
	 */
	private int carTypeId;
	/**
	 * 车辆类型
	 */
	private String carType;
	
	public CarType() {
		super();
	}

	public CarType(int carTypeId, String carType) {
		super();
		this.carTypeId = carTypeId;
		this.carType = carType;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
}
