package com.company.pojo;

/**
 * @author ZH
 * @category 城市实体类
 */
public class City {

	/**
	 * 编号
	 */
	private int id;
	/**
	 * 城市ID
	 */
	private int cityID;
	/**
	 * 城市名称
	 */
	private String city;
	/**
	 * 城市所在省份ID
	 */
	private int provinceID;
	
	
	public City() {
		super();
	}


	public City(int id, int cityID, String city, int provinceID) {
		super();
		this.id = id;
		this.cityID = cityID;
		this.city = city;
		this.provinceID = provinceID;
	}


	public City(int cityID, String city, int provinceID) {
		super();
		this.cityID = cityID;
		this.city = city;
		this.provinceID = provinceID;
	}


	public City(int cityID, String city) {
		super();
		this.cityID = cityID;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCityID() {
		return cityID;
	}


	public void setCityID(int cityID) {
		this.cityID = cityID;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getProvinceID() {
		return provinceID;
	}


	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}
	
	
}
