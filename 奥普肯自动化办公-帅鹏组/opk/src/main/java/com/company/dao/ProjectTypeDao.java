package com.company.dao;

import java.util.List;

import com.company.pojo.ProjectType;

/**
 * @author lsp
 * @category 项目类型dao接口
 *
 */
public interface ProjectTypeDao {
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
	public ProjectType findProTypeByPTId(int proTid);
}
