package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.RequestStateDao;
import com.company.pojo.RequestState;
import com.company.service.RequestStateService;

@Service
public class RequestStateServiceImpl implements RequestStateService {
	@Resource
	RequestStateDao requestStateDao;

	/**
	 * 查询所有状态
	 * 
	 * @return
	 */
	@Override
	public List<RequestState> findRSAll() {
		List<RequestState> list = requestStateDao.findRSAll();
		return list;
	}

	/**
	 * 按照状态id查找状态
	 * 
	 * @return
	 */
	@Override
	public RequestState findRSById(String requestStateId) {
		int id = Integer.valueOf(requestStateId);
		RequestState rs = requestStateDao.findRSById(id);
		return rs;
	}

}
