package com.company.service;

import java.util.List;

import com.company.pojo.Job;

/**
 * @author lsp
 * 
 * @category 员工职位业务逻辑接口
 *
 */
public interface JobService {
	/**
	 * 根据职称id查找职等
	 * 
	 * @param jobId
	 * @return
	 */
	public Job findJobBylId(String jobId);
	
	/**
	 * 查看所有职称
	 * 
	 * @return
	 */
	public List<Job> findJobAll();
}
