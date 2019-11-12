package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.OfficeTypeDao;
import com.company.pojo.OfficeType;
import com.company.service.OfficeTypeService;

@Service
public class OfficeTypeServiceImpl implements OfficeTypeService {
	@Resource
	OfficeTypeDao officeTypeDao;

	/**
	 * 根据办公用品id类型id查找办公用品类型
	 * 
	 * @param officetypeId
	 * @return
	 */
	@Override
	public OfficeType findOfficeTypeByOTId(String officeTypeId) {
		int id = Integer.valueOf(officeTypeId);
		OfficeType ot = officeTypeDao.findOfficeTypeByOTId(id);
		return ot;
	}

	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	@Override
	public List<OfficeType> findOfficeTypeAll() {
		List<OfficeType> list = officeTypeDao.findOfficeTypeAll();
		return list;
	}

}
