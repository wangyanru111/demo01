package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.JobDao;
import com.company.pojo.Job;
import com.company.service.JobService;

/**
 * @author ZH
 * @category 员工职位业务逻辑实现类
 */
@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDao jobDao;
	
	/**
	 * 根据职称id查找职等
	 * 
	 * @param jobId 职位编号
	 * @return 职位对象
	 */
	@Override
	public Job findJobBylId(String jobId) {
		int jobid = Integer.valueOf(jobId);
		Job job = jobDao.findELBylId(jobid);
		return job;
	}

	/**
	 * 查看所有职称
	 * 
	 * @return 职位集合
	 */
	@Override
	public List<Job> findJobAll() {
		List<Job> list = jobDao.findELAll();
		return list;
	}

}
