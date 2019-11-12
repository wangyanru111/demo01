package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ProknowDao;
import com.company.pojo.Proknow;
import com.company.service.ProKnowService;

@Service
public class ProKnowServiceImpl implements ProKnowService {
	@Resource
	ProknowDao proKnowDao;

	/**
	 * 通过项目id查找当前项目支持的知识
	 * 
	 * @param pId
	 * @return
	 */
	@Override
	public List<Proknow> findProKnowByPId(String pId) {
		int pid = Integer.valueOf(pId);
		List<Proknow> list = proKnowDao.findProKnowByPId(pid);
		return list;
	}

	/**
	 * 通过项目编号删除所有的项目知识支持
	 * 
	 * @param pId
	 * @return
	 */
	@Override
	public int deleteProKnowByPId(String pId) {
		int pid = Integer.valueOf(pId);

		return proKnowDao.deleteProKnowByPId(pid);
	}

	/**
	 * 添加项目支持
	 * 
	 * @return
	 */
	@Override
	public boolean addProKnow(Proknow proKnow) {

		return proKnowDao.addProKnow(proKnow) > 0 ? true : false;
	}

}
