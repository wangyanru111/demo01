package com.company.dao;

import java.util.List;

import com.company.pojo.Area;



/**
 * @author 李帅鹏
 * 
 * @category 区县dao接口
 *
 */
public interface AreaDao {
	/**
	 * 根据城市id，查询出所有的区县列表
	 * @param cityId
	 * @return
	 */
	public List<Area> findAreasByCid(int cityId);
	
	/**
	 * 根据区县id查询出对应的区县对象
	 * @param area
	 * @return
	 */
	public Area findAreastByAid(int areaId);
}
