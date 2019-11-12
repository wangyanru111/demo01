package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.EmpLevelDao;
import com.company.pojo.EmpLevel;
import com.company.service.EmpLeveService;
@Service
public class EmpLeveServiceImpl implements EmpLeveService {
     @Resource
     EmpLevelDao emp;
	@Override
	public EmpLevel findELBylId(String lId) {
		int lid=Integer.valueOf(lId);
		EmpLevel empLevel= emp.findELBylId(lid);
		
		return empLevel;
	}

	@Override
	public List<EmpLevel> findELAll() {
		List<EmpLevel> list=emp.findELAll();
		return list;
	}

}
