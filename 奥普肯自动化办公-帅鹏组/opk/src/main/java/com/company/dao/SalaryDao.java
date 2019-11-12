package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Salary;

/**
 * @author lsp
 * @category 薪资Dao接口
 */
public interface SalaryDao {
	/**
	 * 按薪水id查找薪资标准
	 * 
	 * @param id
	 * @return
	 */
	public Salary findSalaryById(int id);
	
	/**
	 * 根据职等id与职位id共同确认薪资标准
	 * 
	 * @param lId
	 * @param jobId
	 * @return
	 */
	public Salary findSalary(@Param(value = "lId")int lId ,@Param(value = "jobId")int jobId);

	/**
	 * 根据职位id查询薪资标准
	 * 
	 * @param jobId
	 * @return
	 */
	public List<Salary> findSalaryByJobId(int jobId);
	
	/**
	 * 更新薪资标准
	 * 
	 * @param salary
	 * @return
	 */
	public int updateSalary(Salary salary);
}
