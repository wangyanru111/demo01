package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.AreaDao;
import com.company.pojo.Area;
import com.company.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	@Resource
	AreaDao areadao;

	@Override
	public List<Area> findAreasByCid(String cityId) {
		int city = Integer.valueOf(cityId);
		List<Area> list = areadao.findAreasByCid(city);
		return list;
	}

	@Override
	public Area findObject(String areaId) {
		int areaid = Integer.valueOf(areaId);
		Area area = areadao.findAreastByAid(areaid);
		return area;
	}

}
