package com.company.service;

import java.util.List;

import com.company.pojo.RequestState;

/**
 * @author lsp
 *
 * @category 请求状态service接口
 */
public interface RequestStateService {
	/**
	 * 查询所有状态
	 * 
	 * @return
	 */
	public List<RequestState> findRSAll();
	
	/**
	 * 按照状态id查找状态
	 * 
	 * @return
	 */
	public RequestState findRSById(String requestStateId);
}
