package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Suggestion;

public interface SuggestionDao {	
	/**
	 * 查找所有的意见
	 * 
	 * @return
	 */
	public List<Suggestion> findSugAll();
	
	/**
	 * 通过意见id查找意见
	 * 
	 * @return
	 */
	public Suggestion findSugBySid(int sugId);	
	
	/**
	 * 通过用户查找当前用户的所有意见
	 * 
	 * @param uId
	 * @return
	 */
	public List<Suggestion> findSugByUid(int uId);
	
	/**
	 * 通过时间段查找意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Suggestion> findSugByDate(@Param(value = "startDate")Date startDate,@Param(value = "endDate")Date endDate);

	/**
	 * 通过用户意见id删除意见
	 * 
	 * @param sugId
	 * @return
	 */
	public int deleteSugBySid(int sugId);
	
	/**
	 * 通过用户id删除意见
	 * 
	 * @param uI
	 * @return
	 */
	public int deleteSugByUid(int uId);
	
	/**
	 * 通过时间段删除意见
	 * 
	 * @param uId
	 * @return
	 */
	public int deleteSugByDate(@Param(value = "startDate")Date startDate,@Param(value = "endDate")Date endDate);
	
	/**
	 * 修改意见
	 * 
	 * @param suggestion
	 * @return
	 */
	public int updateSug(Suggestion suggestion);
	
	/**
	 * 添加意见
	 * 
	 * @param suggestion
	 * @return
	 */
	public int addSug(Suggestion suggestion);
}
