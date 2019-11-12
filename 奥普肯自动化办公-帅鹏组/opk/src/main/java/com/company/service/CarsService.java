package com.company.service;

import java.util.List;

import com.company.pojo.Cars;

/**
 * @author lsp
 * @category 汽车service接口
 * 
 */
public interface CarsService {
	/**
	 * 根据 车辆id查询车辆
	 * 
	 * @param carId
	 * @return
	 */
	public Cars findCarsById(String carId);
	
	/**
	 * 根据 车辆类型id查询车辆
	 * 
	 * @param carId
	 * @return
	 */
	public List<Cars> findCarsByCTId(String carTypeId);
	
	/**
	 * 根据状态id查找车辆
	 * 
	 * @param requestStateId
	 * @return
	 */
	public List<Cars> findCarsByRSId(String requestStateId);
	
	/**
	 * 查询所有的车辆
	 * 
	 * @return
	 */
	public List<Cars> findCarsAll();
	
	/**
	 * 更新车辆信息
	 * 
	 * @param mr
	 * @return
	 */
	public boolean updateCars(Cars cars);
	
	/**
	 * 根据车辆id删除车辆
	 * 
	 * @param carId
	 * @return
	 */
	public boolean deleteCarsById(String carId);
	
	/**
	 * 添加一个车辆
	 * 
	 * @param mr
	 * @return
	 */
	public boolean addCars(Cars cars);
	/**
	 * 批量删除
	 */
	public boolean deleteCarArray(int[] carIds);
}
