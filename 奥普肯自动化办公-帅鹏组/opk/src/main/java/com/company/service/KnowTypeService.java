package com.company.service;

import java.util.List;

import com.company.pojo.KnowType;

/**
 * @author lsp
 * @category 知识类型业务逻辑层
 * 
 */
public interface KnowTypeService {
	/**
	 * 通过知识类型id查找知识类型
	 * 
	 * @param knowTypeId
	 * @return
	 */
	public KnowType findKnowTypeByKTId(String knowTypeId);
	
	/**
	 * 查找所有的知识类型
	 * 
	 * @return
	 */
	public List<KnowType> findKnowTypeAll();
}
