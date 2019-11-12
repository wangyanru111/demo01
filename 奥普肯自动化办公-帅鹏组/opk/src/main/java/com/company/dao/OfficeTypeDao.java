package com.company.dao;

import java.util.List;

import com.company.pojo.OfficeType;

/**
 * @author lsp
 * @category 办公用品类型dao接口
 */
public interface OfficeTypeDao {
	/**
	 * 根据办公用品id类型id查找办公用品类型
	 * 
	 * @param officetypeId
	 * @return
	 */
	public OfficeType findOfficeTypeByOTId(int officeTypeId);
	
	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	public List<OfficeType> findOfficeTypeAll();
}
