package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.company.dao.CarsDao;
import com.company.pojo.Cars;
import com.company.service.CarsService;

@Service
public class CarsServiceImpl implements CarsService {
	@Resource
	CarsDao carsdao;

	@Override
	public Cars findCarsById(String carId) {
		int car = Integer.valueOf(carId);
		return carsdao.findCarsById(car);
	}

	@Override
	public List<Cars> findCarsByCTId(String carTypeId) {
		int cartype = Integer.valueOf(carTypeId);

		List<Cars> list = carsdao.findCarsByCTId(cartype);

		return list;
	}

	@Override
	public List<Cars> findCarsByRSId(String requestStateId) {
		int requeststate = Integer.valueOf(requestStateId);
		List<Cars> list = carsdao.findCarsByRSId(requeststate);

		return list;
	}

	@Override
	public List<Cars> findCarsAll() {
		List<Cars> list = carsdao.findCarsAll();
		return list;
	}

	@Override
	public boolean updateCars(Cars cars) {
		boolean flag;
		int updatecar = carsdao.updateCars(cars);
		if (updatecar != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean deleteCarsById(String carId) {
		boolean flag;
		int o=Integer.valueOf(carId);
		carsdao.deleteCarsById(o);
		if (o != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean addCars(Cars cars) {
		boolean flag;
		int m = carsdao.addCars(cars);
		if (m != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean deleteCarArray(int[] carIds) {
		boolean flag;
	int m=	carsdao.deleteCarArray(carIds);
		if (m != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
