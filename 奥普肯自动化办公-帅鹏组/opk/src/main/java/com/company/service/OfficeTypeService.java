package com.company.service;

import java.util.List;

import com.company.pojo.OfficeType;

/**
 * @author lsp
 * @category 办公用品类型业务逻辑接口
 * 
 */
public interface OfficeTypeService {
	/**
	 * 根据办公用品id类型id查找办公用品类型
	 * 
	 * @param officetypeId
	 * @return
	 */
	public OfficeType findOfficeTypeByOTId(String officeTypeId);
	
	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	public List<OfficeType> findOfficeTypeAll();
}
