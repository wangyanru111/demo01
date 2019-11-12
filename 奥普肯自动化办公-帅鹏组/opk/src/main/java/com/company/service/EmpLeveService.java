package com.company.service;

import java.util.List;

import com.company.pojo.EmpLevel;

/**
 * @author lsp
 * @category 员工职等业务逻辑接口
 *
 */
public interface EmpLeveService {
	/**
	 * 根据职等id查找职等
	 * 
	 * @param lId
	 * @return
	 */
	public EmpLevel findELBylId(String lId);
	
	/**
	 * 查看所有职等
	 * 
	 * @return
	 */
	public List<EmpLevel> findELAll();
}
