package com.company.pojo;

/**
 * @author ZH
 * @category 车辆实体类
 */
public class Cars {

	/**
	 * 车辆编号
	 */
	private int carId;
	/**
	 * 使用状态编号
	 */
	private int requestStateId;
	/**
	 * 车牌号
	 */
	private String number;
	
	/**
	 * 车辆参数
	 */
	private String param;
	/**
	 * 车辆类型编号
	 */
	private int carTypeId;
	
	private CarType carType;
	private RequestState requestState;
	
	public Cars() {
		super();
	}

	
	public Cars(int carId, int requestStateId, String number, String param) {
		super();
		this.carId = carId;
		this.requestStateId = requestStateId;
		this.number = number;
		this.param = param;
	}


	public Cars(int carId, int requestStateId, String number, String param, int carTypeId) {
		super();
		this.carId = carId;
		this.requestStateId = requestStateId;
		this.number = number;
		this.param = param;
		this.carTypeId = carTypeId;
		this.carType = carType;
		this.requestState = requestState;
	}


	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	

	public int getRequestStateId() {
		return requestStateId;
	}

	public void setRequestStateId(int requestStateId) {
		this.requestStateId = requestStateId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}


	public int getCarTypeId() {
		return carTypeId;
	}


	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}


	public CarType getCarType() {
		return carType;
	}


	public void setCarType(CarType carType) {
		this.carType = carType;
	}


	public RequestState getRequestState() {
		return requestState;
	}


	public void setRequestState(RequestState requestState) {
		this.requestState = requestState;
	}
	
	
}
