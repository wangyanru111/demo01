package com.company.service;

import java.util.List;

import com.company.pojo.ProjectState;

/**
 * @author lsp
 * @category 项目流程状态业务逻辑层接口
 *
 */
public interface ProjectStateService {
	/**
	 * 查找所有的项目类型
	 * 
	 * @return
	 */
	public List<ProjectState> findProStateAll();
	
	/**
	 * 根据项目类型id查找项目类型
	 * 
	 * @param proTid
	 * @return
	 */
	public ProjectState findProStateByPTId(String stateId);
}
