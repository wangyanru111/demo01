package com.company.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.KnowledgeDao;
import com.company.pojo.Knowledge;
import com.company.service.KnowledgeService;

/**
 * @author ZH
 * @category 知识业务逻辑实现类
 */
@Service
public class KnowledgeServiceImpl implements KnowledgeService {

	@Autowired
	private KnowledgeDao knowledgeDao;
	
	/**
	 * 通过知识id查找知识
	 * 
	 * @return 知识对象
	 */
	@Override
	public Knowledge findKnowByKId(String knowId) {
		int knowid = Integer.valueOf(knowId);
		Knowledge knowledge = knowledgeDao.findKnowByKId(knowid);
		return knowledge;
	}

	/**
	 * 通过知识类型id查找知识
	 * 
	 * @param knowTypeId 知识类型编号
	 * @return 知识集合
	 */
	@Override
	public List<Knowledge> findKnowByTId(String knowTypeId) {
		int ktId = Integer.valueOf(knowTypeId);
		List<Knowledge> list = knowledgeDao.findKnowByTId(ktId);
		return list;
	}

	/**
	 * 根据时间段查找知识
	 * 
	 * @param startDate 起始时间
	 * @param endDate 结束时间
	 * @return 知识集合
	 */
	@Override
	public List<Knowledge> findKnowByDate(Date startDate, Date endDate) {
		List<Knowledge> list = knowledgeDao.findKnowByDate(startDate, endDate);
		return list;
	}

	/**
	 * 添加一个知识
	 * 
	 * @param knowledge 只是对象
	 * @return 添加结果
	 */
	@Override
	public boolean addKnow(Knowledge knowledge) {
		
		return knowledgeDao.addKnow(knowledge)>0?true:false;
	}

	/**
	 * 更新知识
	 * 
	 * @param knowledge 知识对象
	 * @return 更新结果
	 */
	@Override
	public boolean updateKnow(Knowledge knowledge) {
		
		return knowledgeDao.updateKnow(knowledge)>0?true:false;
	}

	/**
	 * 通过知识id查找知识
	 * 
	 * @param knowId 知识编号
	 * @return 删除结果
	 */
	@Override
	public boolean deleteKnow(String knowId) {
		int kId = Integer.valueOf(knowId);
		return knowledgeDao.deleteKnow(kId)>0?true:false;
	}

}
