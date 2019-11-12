package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.CityDao;
import com.company.pojo.City;
import com.company.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Resource
	CityDao citydao;

	@Override
	public List<City> findCitiesByPid(String provinceId) {
		int province = Integer.valueOf(provinceId);
		return citydao.findCitiesByPid(province);
	}

	@Override
	public City findObject(String cityId) {
		int city = Integer.valueOf(cityId);
		return citydao.findCitiesByCid(city);
	}

}
