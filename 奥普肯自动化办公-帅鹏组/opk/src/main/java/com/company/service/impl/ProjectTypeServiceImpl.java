package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ProjectTypeDao;
import com.company.pojo.ProjectType;
import com.company.service.ProjectTypeService;

@Service
public class ProjectTypeServiceImpl implements ProjectTypeService {
	@Resource
	ProjectTypeDao projectTypeDao;

	/**
	 * 查找所有的项目类型
	 * 
	 * @return
	 */
	@Override
	public List<ProjectType> findProTypeAll() {
		List<ProjectType> list = projectTypeDao.findProTypeAll();
		return list;
	}

	/**
	 * 根据项目类型id查找项目类型
	 * 
	 * @param proTid
	 * @return
	 */
	@Override
	public ProjectType findProTypeByPTId(String proTid) {
		int id = Integer.valueOf(proTid);
		ProjectType pt = projectTypeDao.findProTypeByPTId(id);
		return pt;
	}

}
