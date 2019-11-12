package com.company.dao;

import java.util.List;

import com.company.pojo.ProjectState;


/**
 * @author lsp
 * @category 项目状态dao接口
 *
 */
public interface ProjectStateDao {
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
	public ProjectState findProStateByPTId(int stateId);
}
