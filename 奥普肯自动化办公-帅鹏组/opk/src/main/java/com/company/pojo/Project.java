package com.company.pojo;

import java.util.Date;

/**
 * 
 * @author gong
 * @category 项目实体类
 */

public class Project {
	/**
	 * 项目编号
	 */
	private int pId;
	/**
	 * 项目审批状态编号
	 */
	private int approveStateId;
	/**
	 * 类型编号
	 */
	private int proTid;
	/**
	 * 部门编号
	 */
	private int dId;
	/**
	 * 项目名称
	 */
	private String pName;
	/**
	 * 建立日期
	 */
	private Date createDate;
	/**
	 * 项目流程状态编号
	 */
	private int stateId;
	/**
	 * 项目内容
	 */
	private String context;
	

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	private ProjectType projectType;
	private ProjectState projectState;
	private Dept dept;
	private ApproveState approveState;

	public Project(int pId, int approveStateId, int proTid, int dId, String pName, Date createDate, int stateId) {
		super();
		this.pId = pId;
		this.approveStateId = approveStateId;
		this.proTid = proTid;
		this.dId = dId;
		this.pName = pName;
		this.createDate = createDate;
		this.stateId = stateId;
	}

	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	public ProjectState getProjectState() {
		return projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public ApproveState getApproveState() {
		return approveState;
	}

	public void setApproveState(ApproveState approveState) {
		this.approveState = approveState;
	}

	public Project() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getApproveStateId() {
		return approveStateId;
	}

	public void setApproveStateId(int approveStateId) {
		this.approveStateId = approveStateId;
	}

	public int getProTid() {
		return proTid;
	}

	public void setProTid(int proTid) {
		this.proTid = proTid;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

}
