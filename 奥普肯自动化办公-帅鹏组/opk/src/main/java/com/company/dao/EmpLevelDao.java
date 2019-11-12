package com.company.dao;

import java.util.List;

import com.company.pojo.EmpLevel;

/**
 * @author lsp
 * 
 * @category 职等dao接口
 * 
 */
public interface EmpLevelDao {
	/**
	 * 根据职等id查找职等
	 * 
	 * @param lId
	 * @return
	 */
	public EmpLevel findELBylId(int lId);
	
	/**
	 * 查看所有职等
	 * 
	 * @return
	 */
	public List<EmpLevel> findELAll();
}
