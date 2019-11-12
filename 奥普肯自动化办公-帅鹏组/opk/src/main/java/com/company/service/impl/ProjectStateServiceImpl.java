package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ProjectStateDao;
import com.company.pojo.ProjectState;
import com.company.service.ProjectStateService;
@Service
public class ProjectStateServiceImpl implements ProjectStateService {
    @Resource
    ProjectStateDao projectStateDao;
    /**
	 * 查找所有的项目类型
	 * 
	 * @return
	 */
	@Override
	public List<ProjectState> findProStateAll() {
		List<ProjectState> list = projectStateDao.findProStateAll();
		return list;
	}
	/**
	 * 根据项目类型id查找项目类型
	 * 
	 * @param proTid
	 * @return
	 */
	@Override
	public ProjectState findProStateByPTId(String stateId) {
		int id = Integer.valueOf(stateId);
		ProjectState ps = projectStateDao.findProStateByPTId(id);
		return ps;
	}

}
