package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.ApproveStateDao;
import com.company.pojo.ApproveState;
import com.company.service.ApproveStateService;

/**
 * @author ZH
 * @category 审批状态业务逻辑实现类
 */
@Service
public class ApproveStateServiceImpl implements ApproveStateService {

	@Resource
	private ApproveStateDao approveStateDao;
	
	@Override
	public List<ApproveState> findASById(String approveStateId) {
		int aid = Integer.valueOf(approveStateId);
		List<ApproveState> list = approveStateDao.findASById(aid);
		return list;
	}

	@Override
	public List<ApproveState> findASAll() {
		List<ApproveState> list = approveStateDao.findASAll();
		return list;
	}

}
