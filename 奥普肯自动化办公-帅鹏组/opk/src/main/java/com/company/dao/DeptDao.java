package com.company.dao;

import java.util.List;

import com.company.pojo.Dept;

/**
 * 部门Dao层接口
 * 
 * @author Josh
 *
 */
public interface DeptDao {

	/**
	 * 通过部门ID查询部门
	 */
	public Dept findDeptByDid(int dId);

	/**
	 * 查询所有部门
	 */
	public List<Dept> findAll();

	/**
	 * 通过部门ID删除部门
	 */
	public void deleteByDid(int dId);

}
