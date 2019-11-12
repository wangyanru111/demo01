package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.CarTypeDao;
import com.company.pojo.CarType;
import com.company.service.CarTypeService;

@Service
public class CarTypeServiceImpl implements CarTypeService {
	@Resource
	CarTypeDao CarTypeDao;
	
	/**
	 * 根据车辆类型id查询车辆类型
	 * 
	 * @return
	 */
	@Override
	public CarType findCarsTypeByCTId(String carTypeId) {
		int carType = Integer.valueOf(carTypeId);

		return CarTypeDao.findCarsTypeByCTId(carType);
	}
	/**
	 * 查询所有的车辆类型
	 * 
	 * @return
	 */
	@Override
	public List<CarType> findCarsTypeAll() {
		return CarTypeDao.findCarsTypeAll();
	}

}
