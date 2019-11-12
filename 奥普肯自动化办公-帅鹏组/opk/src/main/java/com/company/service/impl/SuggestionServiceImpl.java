package com.company.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.SuggestionDao;
import com.company.pojo.Suggestion;
import com.company.service.SuggestionService;

@Service
public class SuggestionServiceImpl implements SuggestionService {
	@Resource
	SuggestionDao suggestionDao;

	/**
	 * 查找所有的意见
	 * 
	 * @return
	 */

	@Override
	public List<Suggestion> findSugAll() {
		List<Suggestion> list = suggestionDao.findSugAll();
		return list;
	}

	/**
	 * 通过意见id查找意见
	 * 
	 * @return
	 */
	@Override
	public Suggestion findSugBySid(String sugId) {
		int sugid = Integer.valueOf(sugId);
		Suggestion sug = suggestionDao.findSugBySid(sugid);
		return sug;
	}

	/**
	 * 通过用户查找当前用户的所有意见
	 * 
	 * @param uId
	 * @return
	 */
	@Override
	public List<Suggestion> findSugByUid(String uId) {
		int uid = Integer.valueOf(uId);
		List<Suggestion> list = suggestionDao.findSugByUid(uid);
		return list;
	}

	/**
	 * 通过时间段查找意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Override
	public List<Suggestion> findSugByDate(Date startDate, Date endDate) {
		List<Suggestion> list = suggestionDao.findSugByDate(startDate, endDate);
		return list;
	}

	@Override
	public List<Suggestion> findSug(String uId, Date startDate, Date endDate) {

		return null;
	}

	/**
	 * 通过用户意见id删除意见
	 * 
	 * @param sugId
	 * @return
	 */
	@Override
	public boolean deleteSugBySid(String sugId) {
		int id = Integer.valueOf(sugId);

		return suggestionDao.deleteSugBySid(id) > 0 ? true : false;
	}

	/**
	 * 通过用户id删除意见
	 * 
	 * @param uI
	 * @return
	 */
	@Override
	public boolean deleteSugByUid(String uId) {
		int id = Integer.valueOf(uId);

		return suggestionDao.deleteSugByUid(id) > 0 ? true : false;
	}

	@Override
	public boolean deleteSugByDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 通过时间段删除意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Override
	public boolean deleteSugByDate(String uId, Date startDate, Date endDate) {

		return suggestionDao.deleteSugByDate(startDate, endDate) > 0 ? true : false;
	}

	/**
	 * 修改意见
	 * 
	 * @param suggestion
	 * @return
	 */
	@Override
	public boolean updateSug(Suggestion suggestion) {

		return suggestionDao.updateSug(suggestion) > 0 ? true : false;
	}

	/**
	 * 添加意见
	 * 
	 * @param suggestion
	 * @return
	 */
	@Override
	public boolean addSug(Suggestion suggestion) {

		return suggestionDao.addSug(suggestion) > 0 ? true : false;
	}

}
