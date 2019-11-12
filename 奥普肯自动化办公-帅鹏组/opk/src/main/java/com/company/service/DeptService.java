package com.company.service;

import java.util.List;
import com.company.pojo.Dept;

/**
 * 部门业务逻辑接口类
 * 
 * @author Josh
 *
 */

public interface DeptService {
	/**
	 * 通过部门ID查询部门
	 */
	public Dept findDeptByDid(String dId);

	/**
	 * 查询所有部门
	 */
	public List<Dept> findAll();

	/**
	 * 通过部门ID删除部门
	 */
	public void deleteByDid(String dId);

}
