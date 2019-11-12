package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Project;

/**
 * @author lsp
 * @category 项目dao层接口
 *
 */
public interface ProjectDao {
	/**
	 * 查询所有项目
	 * 
	 * @return
	 */
	public List<Project> findProAll();

	/**
	 * 根据项目ID查找项目
	 * 
	 * @param pId
	 * @return
	 */
	public Project findProByPId(int pId);

	/**
	 * 通过项目名查询项目(ajax动态实现模糊查询)
	 * 
	 * @param pName
	 * @return
	 */
	public List<Project> findProByPName(@Param(value = "pName")String pName);

	/**
	 * 通过项目类型查找项目
	 * 
	 * @param proTid
	 * @return
	 */
	public List<Project> findProByTid(int proTid);

	/**
	 * 通过项目流程状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	public List<Project> findProByPid(int proId);

	/**
	 * 通过项目审批状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	public List<Project> findProByASid(@Param(value = "approveStateId") int approveStateId);

	/**
	 * 通过项目流程状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	public List<Project> findProBySid(int stateId);

	/**
	 * 通过部门id查找项目
	 * 
	 * @param dId
	 * @return
	 */
	public List<Project> findProByDid(int dep_did);

	/**
	 * 通过时间段查找项目
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Project> findProByDate(@Param(value = "startDate") Date startDate,
			@Param(value = "endDate") Date endDate);

	/**
	 * 删除所有项目
	 */
	public int deleteProAll();

	/**
	 * 通过项目id删除项目
	 * 
	 * @param pId
	 * @return
	 */
	public int deleteProByPId(int deleteProByPId);

	/**
	 * 通过项目类型id删除项目
	 * 
	 * @param proTid
	 * @return
	 */
	public int deleteProByTId(int proTid);

	/**
	 * 通过部门id删除项目
	 * 
	 * @param dep_did
	 * @return
	 */
	public int deleteProByDId(int dep_did);

	/**
	 * 通过流程状态id删除项目
	 * 
	 * @param sId
	 * @return
	 */
	public int deleteProBySId(int stateId);

	/**
	 * 根据pid更新项目stateid信息
	 * 
	 * @param pro
	 * @return
	 */
	public int updatePro(@Param(value = "pId")int pId, @Param(value = "stateId")int stateId);

	/**
	 * 创建一个项目
	 * 
	 * @param pro
	 * @return
	 */
	public int addPro(Project pro);

	/**
	 * 通过项目id删除项目
	 * 
	 * @param pId
	 * @return
	 */
	public int deletePid(int pId);

	/**
	 * 提交项目修改项目状态ID
	 */
	public int submitproject(@Param(value = "approveStateId") int approveStateId, @Param(value = "pId") int pId);
	/**
	 * 批量删除
	 */
	public int deletePro(int[] pIds);

}
