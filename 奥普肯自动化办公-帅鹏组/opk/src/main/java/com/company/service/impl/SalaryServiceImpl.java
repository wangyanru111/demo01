package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.SalaryDao;
import com.company.pojo.Salary;
import com.company.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {
	@Resource
	SalaryDao salaryDao;

	/**
	 * 按薪水id查找薪资标准
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Salary findSalaryById(String id) {
		int Id = Integer.valueOf(id);
		Salary salary = salaryDao.findSalaryById(Id);
		return salary;
	}

	/**
	 * 根据职等id与职位id共同确认薪资标准
	 * 
	 * @param lId
	 * @param jobId
	 * @return
	 */
	@Override
	public Salary findSalary(String lId, String jobId) {
		int lid = Integer.valueOf(lId);
		int jobid = Integer.valueOf(jobId);
		Salary salary = salaryDao.findSalary(lid, jobid);
		return salary;
	}

	/**
	 * 根据职位id查询薪资标准
	 * 
	 * @param jobId
	 * @return
	 */
	@Override
	public List<Salary> findSalaryByJobId(String jobId) {
		int jobid = Integer.valueOf(jobId);
		List<Salary> list = salaryDao.findSalaryByJobId(jobid);
		return list;
	}

	/**
	 * 更新薪资标准
	 * 
	 * @param salary
	 * @return
	 */
	@Override
	public boolean updateSalary(Salary salary) {

		return salaryDao.updateSalary(salary) > 0 ? true : false;
	}

}
