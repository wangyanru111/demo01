package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ProvinceDao;
import com.company.pojo.Province;
import com.company.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	@Resource
	ProvinceDao provincedao;

	@Override
	public List<Province> findAll() {
		return provincedao.findProvinceAll();
	}

	@Override
	public Province findObject(String provinceId) {
		int province = Integer.valueOf(provinceId);
		return provincedao.findProvince(province);
	}

}
