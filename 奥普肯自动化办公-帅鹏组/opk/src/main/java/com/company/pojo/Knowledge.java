package com.company.pojo;

import java.util.Date;

/**
 * @author ZH
 * @category 知识实体类
 */
public class Knowledge {

	/**
	 * 知识编号
	 */
	private int knowId;
	/**
	 * 知识类型编号
	 */
	private int knowTypeId;
	/**
	 * 知识文档
	 */
	private String document;
	
	/**
	 * 上传时间
	 */
	private Date uploadDate;
	
	private KnowType knowType;
	
	public Knowledge() {
		super();
	}

	public int getKnowId() {
		return knowId;
	}

	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}

	public int getKnowTypeId() {
		return knowTypeId;
	}

	public void setKnowTypeId(int knowTypeId) {
		this.knowTypeId = knowTypeId;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public KnowType getKnowType() {
		return knowType;
	}

	public void setKnowType(KnowType knowType) {
		this.knowType = knowType;
	}
	
	
}
