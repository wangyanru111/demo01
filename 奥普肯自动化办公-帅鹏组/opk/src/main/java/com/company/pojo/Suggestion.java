package com.company.pojo;

import java.util.Date;
/**
 * 
 * @author gong
 * @category 意见箱实体类
 *
 */

public class Suggestion {
	/**
	 * 意见编号
	 */
	private int sugId;
	/**
	 * 用户Id
	 */
	private int uId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 意见详情
	 */
	private String content;
	/**
	 * 提交日期
	 */
	private Date submitDate;

	private User user;
	
	
	public Suggestion() {
		super();
	}

	public Suggestion(int sugId, int uId, String title, String content, Date submitDate) {
		super();
		this.sugId = sugId;
		this.uId = uId;
		this.title = title;
		this.content = content;
		this.submitDate = submitDate;
	}

	public int getSugId() {
		return sugId;
	}

	public void setSugId(int sugId) {
		this.sugId = sugId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
