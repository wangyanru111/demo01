package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Email;

/**
 * @author lsp
 * @category 邮件Dao接口
 */
public interface EmailDao {
	/**
	 * 查询所有邮件
	 * 
	 * @return
	 */
	public List<Email> findEmailAll();
	
	/**
	 * 按照邮件id查找邮件
	 * 
	 * @param emailId
	 * @return
	 */
	public Email findEmailByEId(int emailId);
	
	/**
	 * 按照指定发件用户id，查找所有邮件
	 * 
	 * @param uId
	 * @return
	 */
	public List<Email> findEmailBySendUId(int sendUId);
	
	/**
	 * 按照指定收件用户id，查找所有邮件
	 * 
	 * @param uId
	 * @return
	 */
	public List<Email> findEmailByRecUid(int recUid);
	
	/**
	 * 按照指定时间段查找邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Email> findEmailByDate(@Param(value = "startDate")Date startDate,@Param(value = "endDate")Date endDate);

	/**
	 * 根据邮件id删除邮件
	 * 
	 * @param emailId
	 * @return
	 */
	public int deleteEmailByEId(int emailId);
	
	/**
	 * 根据发烧用用户id删除邮件
	 * 
	 * @param uId
	 * @return
	 */
	public int deleteEmailByUId(int uId);
	
	/**
	 * 根据时间段删除邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public int deleteEmailByDate(@Param(value = "startDate")Date startDate,@Param(value = "endDate")Date endDate);
}
