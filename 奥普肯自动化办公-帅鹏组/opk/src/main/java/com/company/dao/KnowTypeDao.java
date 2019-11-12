package com.company.dao;

import java.util.List;

import com.company.pojo.KnowType;

/**
 * @author lsp
 * @category 知识类型dao接口
 */
public interface KnowTypeDao {
	/**
	 * 通过知识类型id查找知识类型
	 * 
	 * @param knowTypeId
	 * @return
	 */
	public KnowType findKnowTypeByKTId(int knowTypeId);
	
	/**
	 * 查找所有的知识类型
	 * 
	 * @return
	 */
	public List<KnowType> findKnowTypeAll();
}
