package com.company.service;

import java.util.List;

import com.company.pojo.ApproveState;

/**
 * @author lsp
 * @category 审批状态业务逻辑接口
 */
public interface ApproveStateService {
	/**
	 * 根据审批状态id查询审批状态
	 * 
	 * @param approveStateId
	 * @return
	 */
	public List<ApproveState> findASById(String approveStateId);
	
	/**
	 * 查询所有审批状态
	 * 
	 * @return
	 */
	public List<ApproveState> findASAll();
}
