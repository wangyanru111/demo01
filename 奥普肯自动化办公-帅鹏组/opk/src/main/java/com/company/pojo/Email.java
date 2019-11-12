package com.company.pojo;

import java.util.Date;

/**
 * @author ZH
 * @category 邮箱实体类
 */
public class Email {

	/**
	 * 邮件编号
	 */
	private int emailId;
	/**
	 * 发件人编号
	 */
	private int sendUid;
	/**
	 * 收件人编号
	 */
	private int recUid;
	/**
	 * 邮件内容
	 */
	private String eContent;
	/**
	 * 邮件主题
	 */
	private String eTitle;
	/**
	 * 发送日期
	 */
	private Date sendDate;
	
	public Email() {
		super();
	}

	public int getEmailId() {
		return emailId;
	}

	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	public int getSendUid() {
		return sendUid;
	}

	public void setSendUid(int sendUid) {
		this.sendUid = sendUid;
	}

	public int getRecUid() {
		return recUid;
	}

	public void setRecUid(int recUid) {
		this.recUid = recUid;
	}

	public String geteContent() {
		return eContent;
	}

	public void seteContent(String eContent) {
		this.eContent = eContent;
	}

	public String geteTitle() {
		return eTitle;
	}

	public void seteTitle(String eTitle) {
		this.eTitle = eTitle;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
}
