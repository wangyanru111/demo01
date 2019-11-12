package com.company.dao;

import java.util.List;

import com.company.pojo.City;



/**
 * @author 李帅鹏
 * 
 * @category 城市dao接口
 */
public interface CityDao {
	/**
	 * 根据省份id查询出所有的城市列表
	 * @param provinceId
	 * @return
	 */
	public List<City> findCitiesByPid(int provinceId);
	
	/**
	 * 根据城市id，查询出对应的城市对象
	 * @param cityId
	 * @return
	 */
	public City findCitiesByCid(int cityId);
}
