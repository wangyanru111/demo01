package com.company.service;

import java.util.List;

import com.company.pojo.Proknow;

/**
 * @author lsp
 * @category 项目知识支持service接口
 */
public interface ProKnowService {
	/**
	 * 通过项目id查找当前项目支持的知识
	 * 
	 * @param pId
	 * @return
	 */
	public List<Proknow> findProKnowByPId(String pId);
	
	
	/**
	 * 通过项目编号删除所有的项目知识支持
	 * 
	 * @param pId
	 * @return
	 */
	public int deleteProKnowByPId(String pId);
	
	/**
	 * 添加项目支持
	 * 
	 * @return
	 */
	public boolean addProKnow(Proknow proKnow);
}
