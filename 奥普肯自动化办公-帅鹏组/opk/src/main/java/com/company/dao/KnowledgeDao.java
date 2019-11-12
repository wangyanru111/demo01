package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Knowledge;

/**
 * @author lsp
 * @category 项目知识dao接口
 */
public interface KnowledgeDao {
	/**
	 * 通过知识id查找知识
	 * 
	 * @return
	 */
	public Knowledge findKnowByKId(int knowId);
	
	/**
	 * 通过知识类型id查找知识
	 * 
	 * @param knowTypeId
	 * @return
	 */
	public List<Knowledge> findKnowByTId(int knowTypeId);
	
	/**
	 * 根据时间段查找知识
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Knowledge> findKnowByDate(@Param(value = "startDate") Date startDate,@Param(value = "endDate") Date endDate);
	
	/**
	 * 添加一个知识
	 * 
	 * @param knowledge
	 * @return
	 */
	public int addKnow(Knowledge knowledge);
	
	/**
	 * 更新知识
	 * 
	 * @param knowledge
	 * @return
	 */
	public int updateKnow(Knowledge knowledge);
	
	/**
	 * 通过知识id查找知识
	 * 
	 * @param knowId
	 * @return
	 */
	public int deleteKnow(int knowId);
}
