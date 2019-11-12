package com.company.dao;

import java.util.List;

import com.company.pojo.CarType;

/**
 * @author lsp
 * @category 车辆类型Dao接口
 */
public interface CarTypeDao {
	/**
	 * 根据车辆类型id查询车辆类型
	 * 
	 * @return
	 */
	public CarType findCarsTypeByCTId(int carTypeId);
	
	/**
	 * 查询所有的车辆类型
	 * 
	 * @return
	 */
	public  List<CarType> findCarsTypeAll();
}
