package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.KnowTypeDao;
import com.company.pojo.KnowType;
import com.company.service.KnowTypeService;

/**
 * @author ZH
 * @category 知识类型业务逻辑实现类
 */
@Service
public class KnowTypeServiceImpl implements KnowTypeService {

	@Autowired
	private KnowTypeDao knowtypeDao;
	
	/**
	 * 通过知识类型id查找知识类型
	 * 
	 * @param knowTypeId 知识类型编号
	 * @return 知识对象
	 */
	@Override
	public KnowType findKnowTypeByKTId(String knowTypeId) {
		int ktId = Integer.valueOf(knowTypeId);
		KnowType knowType = knowtypeDao.findKnowTypeByKTId(ktId);
		return knowType;
	}

	/**
	 * 查找所有的知识类型
	 * 
	 * @return 知识类型集合
	 */
	@Override
	public List<KnowType> findKnowTypeAll() {
		List<KnowType> list = knowtypeDao.findKnowTypeAll();
		return list;
	}

}
