package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.company.dao.OfficeDao;
import com.company.pojo.Office;
import com.company.service.OfficeService;

@Service
public class OfficeServiceImpl implements OfficeService {
	@Resource
	OfficeDao officeDao;

	/**
	 * 根据办公用品id查询办公用品
	 * 
	 * @param oId
	 * @return
	 */
	@Override
	public Office findOfficeByOId(String oId) {
		int id = Integer.valueOf(oId);
		Office office = officeDao.findOfficeByOId(id);
		return office;
	}

	/**
	 * 根据请求状态查找办公用品
	 * 
	 * @param requestStateId
	 * @return
	 */
	@Override
	public List<Office> findOfficeByRSId(String requestStateId) {
		int id = Integer.valueOf(requestStateId);
		List<Office> list = officeDao.findOfficeByRSId(id);
		return list;
	}

	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	@Override
	public List<Office> findOfficeAll() {
		List<Office> list = officeDao.findOfficeAll();
		return list;
	}

	/**
	 * 更新办公用品
	 * 
	 * @param office
	 * @return
	 */
	@Override
	public boolean updateOffice(Office office) {

		return officeDao.updateOffice(office) > 0 ? true : false;
	}

	/**
	 * 根据办公用品id删除办公用品
	 * 
	 * @param oId
	 * @return
	 */
	@Override
	public boolean deleteOfficeByOId(String oId) {
		int id = Integer.valueOf(oId);
		return officeDao.deleteOfficeByOId(id) > 0 ? true : false;
	}

	/**
	 * 添加一个办公用品
	 * 
	 * @param office
	 * @return
	 */
	@Override
	public boolean addOffice(Office office) {

		return officeDao.addOffice(office) > 0 ? true : false;
	}

	@Override
	public boolean deleteArr(int[] oIds) {
		boolean flag;
	int	i=officeDao.deleteArr(oIds);
	if(i!=0){
		flag=true;
	}else {
		flag=false;
	}
		return flag;
	}

}
