package com.company.service;

import java.util.Date;
import java.util.List;

import com.company.pojo.Suggestion;

/**
 * @author lsp
 * @category 意见业务逻辑接口
 *
 */
public interface SuggestionService {
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
	public Suggestion findSugBySid(String sugId);

	/**
	 * 通过用户查找当前用户的所有意见
	 * 
	 * @param uId
	 * @return
	 */
	public List<Suggestion> findSugByUid(String uId);

	/**
	 * 通过时间段查找意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Suggestion> findSugByDate(Date startDate, Date endDate);

	/**
	 * 通过用户id以及时间段查找意见
	 * 
	 * @param uId
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Suggestion> findSug(String uId, Date startDate, Date endDate);

	/**
	 * 通过用户意见id删除意见
	 * 
	 * @param sugId
	 * @return
	 */
	public boolean deleteSugBySid(String sugId);

	/**
	 * 通过用户id删除意见
	 * 
	 * @param uI
	 * @return
	 */
	public boolean deleteSugByUid(String uId);

	/**
	 * 通过时间段删除意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public boolean deleteSugByDate(Date startDate, Date endDate);

	/**
	 * 通过时间段以及用户id删除意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public boolean deleteSugByDate(String uId, Date startDate, Date endDate);

	/**
	 * 修改意见
	 * 
	 * @param suggestion
	 * @return
	 */
	public boolean updateSug(Suggestion suggestion);

	/**
	 * 添加意见
	 * 
	 * @param suggestion
	 * @return
	 */
	public boolean addSug(Suggestion suggestion);
}
