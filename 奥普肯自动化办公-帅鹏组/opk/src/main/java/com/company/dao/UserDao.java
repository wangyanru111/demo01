package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.User;

/**
 * @author lsp
 * @category 用户dao层接口
 */
public interface UserDao {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<User> findUserAll();

	/**
	 * 通过部门id查找用户
	 * 
	 * @param dId
	 * @return
	 */
	public List<User> findUserByDid(int dId);

	/**
	 * 通过用户名密码查询(登录用)
	 */
	public User findUserByName(@Param(value = "uName") String uName, @Param(value = "pass") String pass);

	/**
	 * 通过用户id查找用户
	 * 
	 * @param uId
	 */
	public User findUserByUid(int uId);

	/**
	 * 根据职位查找用户
	 * 
	 * @param jobId
	 * @return
	 */
	public List<User> findUserByJobId(int jobId);
	
	/**
	 * 根据职位与职等查找用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	public List<User> findUserByJobIdAndELId(@Param(value = "jobId") int jobId, @Param(value = "lId") int lId);
	
	/**
	 * 注册用户
	 */
	public int regist(User user);

	/**
	 * 通过用户id删除用户
	 * 
	 * @param uId
	 * @return
	 */
	public int deleteUser(int uId);

	/**
	 * 根据部门id删除用户
	 * 
	 * @param dId
	 * @return
	 */
	public int deleteUserByDid(int dId);

	/**
	 * 根据职位与职等删除用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	public int deleteUserByJobId(@Param(value = "jobId") int jobId, @Param(value = "lId") int lId);

	/**
	 * 删除所有用户
	 * 
	 * @return
	 */
	public int deleteUserAll();

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	public int upDate(User user);
	/**
	 * 批量删除
	 */
	public  int deleteArray(int[] uIds);
}
