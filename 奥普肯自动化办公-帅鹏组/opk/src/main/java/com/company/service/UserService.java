package com.company.service;

import java.util.List;

import com.company.pojo.User;
import com.company.vo.UserVo;

public interface UserService {

	/**
	 * 根据用户id查找用户
	 * 
	 * @param uId
	 * @return
	 */
	public User findUserByUId(String uId);

	/**
	 * 通过部门id查找用户
	 * 
	 * @param dId
	 * @return
	 */
	public List<User> findUserByDid(String dId);
	
	/**
	 * 通过用户名密码查询(登录用)
	 */
	public User findUserByName(String uName, String pass);

	/**
	 * 按员工职位查找用户
	 * 
	 * @param jobId
	 * @return
	 */
	public List<User> findUserByJobId(String jobId);
	
	/**
	 * 按员工职位和职等查找用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	public List<User> findUserByJobIdAndELId(String jobId, String lId);
	
	/**
	 * 查询所有部门经理
	 * 
	 * @param jobId
	 * @return
	 */
	public List<User> findDeptLeaderAll();
	
	/**
	 * 通过部门id查找用户(不包含项目领导返回)
	 * 
	 * @param dId
	 * @return
	 */
	public List<User> findUserByDidNoLeader(String dId);
	
	/**
	 * 根据用户id查找用户
	 * 
	 * @param uId
	 * @return
	 */
	public UserVo findUserVoByUId(String uId);
	
	/**
	 * 查询所有部门经理(返回vo)
	 * 
	 * @param jobId
	 * @return
	 */
	public List<UserVo> findDeptLeaderVoAll();
	
	/**
	 * 通过部门id查找用户(不包含项目领导返回vo)
	 * 
	 * @param dId
	 * @return
	 */
	public List<UserVo> findUserVoByDidNoLeader(String dId);
	
	/**
	 * 根据用户id查找用户(返回vo)
	 * 
	 * @param uId
	 * @return
	 */
	public List<UserVo> findUserVoAll();
	
	/**
	 * 注册用户
	 */
	public boolean regist(User user);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<User> findUserAll();

	/**
	 * 通过用户id删除用户
	 * 
	 * @param uId
	 * @return
	 */
	public boolean deleteUser(String uId);

	/**
	 * 根据部门id删除用户
	 * 
	 * @param dId
	 * @return
	 */
	public boolean deleteUserByDid(String dId);

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	public boolean update(User user);
	/**
	 * 批量删除
	 */
	public boolean deleteArray(int[] uIds);
}
