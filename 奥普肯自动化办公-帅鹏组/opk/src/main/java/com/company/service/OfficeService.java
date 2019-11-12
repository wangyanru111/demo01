package com.company.service;

import java.util.List;

import com.company.pojo.Office;

/**
 * @author lsp
 * 
 * @category 办公用品业务逻辑接口
 *
 */
public interface OfficeService {
	/**
	 * 根据办公用品id查询办公用品
	 * 
	 * @param oId
	 * @return
	 */
	public Office findOfficeByOId(String oId);
	
	/**
	 * 根据请求状态查找办公用品
	 * 
	 * @param requestStateId
	 * @return
	 */
	public List<Office> findOfficeByRSId(String requestStateId);
	
	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	public List<Office> findOfficeAll();
	
	/**
	 * 更新办公用品
	 * 
	 * @param office
	 * @return
	 */
	public boolean updateOffice(Office office);
	
	/**
	 * 根据办公用品id删除办公用品
	 * 
	 * @param oId
	 * @return
	 */
	public boolean deleteOfficeByOId(String oId);
	
	/**
	 * 添加一个办公用品
	 * 
	 * @param office
	 * @return
	 */
	public boolean addOffice(Office office);
	/**
	 * 批量删除
	 */
	public boolean deleteArr(int[] oIds);
}
