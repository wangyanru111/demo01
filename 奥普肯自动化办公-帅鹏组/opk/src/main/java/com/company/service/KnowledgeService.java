package com.company.service;

import java.util.Date;
import java.util.List;

import com.company.pojo.Knowledge;

/**
 * @author lsp
 * @category 知识业务逻辑层接口
 *
 */
public interface KnowledgeService {
	/**
	 * 通过知识id查找知识
	 * 
	 * @return
	 */
	public Knowledge findKnowByKId(String knowId);
	
	/**
	 * 通过知识类型id查找知识
	 * 
	 * @param knowTypeId
	 * @return
	 */
	public List<Knowledge> findKnowByTId(String knowTypeId);
	
	/**
	 * 根据时间段查找知识
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Knowledge> findKnowByDate(Date startDate,Date endDate);
	
	/**
	 * 添加一个知识
	 * 
	 * @param knowledge
	 * @return
	 */
	public boolean addKnow(Knowledge knowledge);
	
	/**
	 * 更新知识
	 * 
	 * @param knowledge
	 * @return
	 */
	public boolean updateKnow(Knowledge knowledge);
	
	/**
	 * 通过知识id查找知识
	 * 
	 * @param knowId
	 * @return
	 */
	public boolean deleteKnow(String knowId);
}
