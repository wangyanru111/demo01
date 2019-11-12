package com.company.service;

import java.util.Date;
import java.util.List;

import com.company.pojo.Email;

/**
 * @author lsp
 * 
 * @category 邮件业务逻辑类
 *
 */
public interface EmailService {
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
	public Email findEmailByEId(String emailId);
	
	/**
	 * 按照指定发件用户id，查找所有邮件
	 * 
	 * @param uId
	 * @return
	 */
	public List<Email> findEmailBySendUId(String sendUId);
	
	/**
	 * 按照指定收件用户id，查找所有邮件
	 * 
	 * @param uId
	 * @return
	 */
	public List<Email> findEmailByRecUid(String recUid);
	
	/**
	 * 按照指定时间段查找邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Email> findEmailByDate(Date startDate,Date endDate);

	/**
	 * 按照指定时间段、以及发件人查找邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Email> findEmailByDateAndSendUid(String sendUid,Date startDate,Date endDate);
	
	/**
	 * 按照指定时间段、以及发件人查找邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Email> findEmailByDateAndRecUid(String recUid,Date startDate,Date endDate);
	
	/**
	 * 根据邮件id删除邮件
	 * 
	 * @param emailId
	 * @return
	 */
	public boolean deleteEmailByEId(String emailId);
	
	/**
	 * 根据发烧用用户id删除邮件
	 * 
	 * @param uId
	 * @return
	 */
	public boolean deleteEmailByUId(String uId);
	
	/**
	 * 根据时间段删除邮件
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public boolean deleteEmailByDate(Date startDate,Date endDate);
	
	/**
	 * 按照指定时间段、以及发件人删除邮件
	 * 
	 * @param recUid
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public boolean deleteEmailByDateAndSendUid(String sendUid,Date startDate,Date endDate);
	
	/**
	 * 按照指定时间段、以及收件人删除邮件
	 * 
	 * @param recUid
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public boolean deleteEmailByDateAndRecUid(String recUid,Date startDate,Date endDate);
}
