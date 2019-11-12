package com.company.dao;

import java.util.List;

import com.company.pojo.RequestState;

/**
 * @author lsp
 * @category 状态dao接口
 *
 */
public interface RequestStateDao {
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
	public RequestState findRSById(int requestStateId);
}
