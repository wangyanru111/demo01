package com.company.service;

import java.util.List;

import com.company.pojo.CarType;

/**
 * @author lsp
 * @category 汽车类型业务逻辑
 *
 */
public interface CarTypeService {
	/**
	 * 根据车辆类型id查询车辆类型
	 * 
	 * @return
	 */
	public  CarType findCarsTypeByCTId(String carTypeId);
	
	/**
	 * 查询所有的车辆类型
	 * 
	 * @return
	 */
	public  List<CarType> findCarsTypeAll();
}
