package com.company.service;

import java.util.List;

import com.company.pojo.ProjectType;

/**
 * @author lsp
 * @category 项目类型业务逻辑接口
 *
 */
public interface ProjectTypeService {
	/**
	 * 查找所有的项目类型
	 * 
	 * @return
	 */
	public List<ProjectType> findProTypeAll();
	
	/**
	 * 根据项目类型id查找项目类型
	 * 
	 * @param proTid
	 * @return
	 */
	public ProjectType findProTypeByPTId(String proTid);
}
