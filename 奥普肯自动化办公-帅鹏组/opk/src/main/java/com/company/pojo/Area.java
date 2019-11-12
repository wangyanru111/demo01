package com.company.pojo;

/**
 * @author ZH
 * @category 区县实体类
 */
public class Area {

	/**
	 * 编号
	 */
	private int id;
	/**
	 * 区县ID
	 */
	private int areaID;
	/**
	 * 区县名称
	 */
	private String areas;
	/**
	 * 区县所在城市ID
	 */
	private int cityID;
	
	
	public Area() {
		super();
	}


	public Area(int id, int areaID, String areas, int cityID) {
		super();
		this.id = id;
		this.areaID = areaID;
		this.areas = areas;
		this.cityID = cityID;
	}


	public Area(int areaID, String areas, int cityID) {
		super();
		this.areaID = areaID;
		this.areas = areas;
		this.cityID = cityID;
	}


	public Area(int areaID, String areas) {
		super();
		this.areaID = areaID;
		this.areas = areas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAreaID() {
		return areaID;
	}


	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}


	public String getAreas() {
		return areas;
	}


	public void setAreas(String areas) {
		this.areas = areas;
	}


	public int getCityID() {
		return cityID;
	}


	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	
	
}
