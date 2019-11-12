package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.DeptDao;
import com.company.pojo.Dept;
import com.company.service.DeptService;

/**
 * 部门业务逻辑实现类
 * 
 * @author Josh
 *
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Resource
	DeptDao deptDao;

	/**
	 * 通过部门ID查询部门
	 */
	@Override
	public Dept findDeptByDid(String dId) {
		int dIdInt = 0;
		if (dId != null) {
			dIdInt = Integer.valueOf(dId);
		}
		Dept dept = deptDao.findDeptByDid(dIdInt);
		return dept;
	}

	/**
	 * 查询所有部门
	 */
	@Override
	public List<Dept> findAll() {
		List<Dept> list = deptDao.findAll();
		return list;
	}

	/**
	 * 通过部门ID删除部门
	 */
	@Override
	public void deleteByDid(String dId) {

	}

}
