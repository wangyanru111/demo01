package com.company.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ProjectDao;
import com.company.pojo.Project;
import com.company.service.ProjectService;

/**
 * @author Josh
 * @category 项目业务逻辑层实现类
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService {
	@Resource
	ProjectDao projectDao;

	/**
	 * 查询所有项目
	 * 
	 * @return
	 */
	@Override
	public List<Project> findProAll() {
		List<Project> list = projectDao.findProAll();
		return list;
	}

	/**
	 * 根据项目ID查找项目
	 * 
	 * @param pId
	 * @return
	 */
	@Override
	public Project findProByPId(String pId) {
		int pIdInt = 0;
		if (pId != null) {
			pIdInt = Integer.valueOf(pId);
		}
		Project pro = projectDao.findProByPId(pIdInt);
		return pro;
	}

	/**
	 * 通过项目名查询项目(ajax动态实现模糊查询)
	 * 
	 * @param pName
	 * @return
	 */
	@Override
	public List<Project> findProByPName(String pName) {
		List<Project> list = projectDao.findProByPName(pName);
		return list;
	}

	/**
	 * 通过项目类型查找项目
	 * 
	 * @param proTid
	 * @return
	 */
	@Override
	public List<Project> findProByTid(String proTid) {
		int proTidInt = 0;
		if (proTid != null) {
			proTidInt = Integer.valueOf(proTid);
		}
		List<Project> list = projectDao.findProByTid(proTidInt);
		return list;
	}

	/**
	 * 通过项目状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	@Override
	public List<Project> findProBySid(String stateId) {
		int stateIdInt = 0;
		if (stateId != null) {
			stateIdInt = Integer.valueOf(stateId);
		}
		List<Project> list = projectDao.findProBySid(stateIdInt);
		return list;
	}

	/**
	 * 通过部门id查找项目
	 * 
	 * @param dId
	 * @return
	 */
	@Override
	public List<Project> findProByDid(String dep_did) {
		int dep_did_int = 0;
		if (dep_did != null) {
			dep_did_int = Integer.valueOf(dep_did);
		}
		List<Project> list = projectDao.findProByDid(dep_did_int);
		return list;
	}

	/**
	 * 通过时间段查找项目
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Override
	public List<Project> findProByDate(Date startDate, Date endDate) {
		List<Project> list = projectDao.findProByDate(startDate, endDate);
		return list;
	}

	@Override
	public List<Project> findPro(String dep_did, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProByPId(String pId) {
		boolean flag;
		int op = Integer.valueOf(pId);
		int m = projectDao.deletePid(op);
		if (m != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean deleteProByTId(String proTid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProByDId(String dep_did) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProBySId(String stateId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePro(Project pro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPro(Project pro) {

		return projectDao.addPro(pro) > 0 ? true : false;
	}

	@Override
	public int submitproject(int approveStateId, int pId) {

		return projectDao.submitproject(approveStateId, pId);
	}

	/**
	 * 通过项目审批状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	@Override
	public List<Project> findProByASid(String approveStateId) {
		int id = Integer.valueOf(approveStateId);
		List<Project> list = projectDao.findProByASid(id);
		return list;
	}

	/**
	 * 根据pid更新项目stateid信息
	 * 
	 * @param pro
	 * @return
	 */
	@Override
	public int updatePro(String pId, String stateId) {
		int id1 = Integer.valueOf(pId);
		int id2 = Integer.valueOf(stateId);
		return projectDao.updatePro(id1, id2);
	}

	@Override
	public boolean deletePro(int[] pIds) {
		
		boolean flag;
	int pro=	projectDao.deletePro(pIds);
	if(pro!=0){
		flag=true;
	}else {
		flag=false;
	}		
		return flag;
	}

}
