package com.company.pojo;

/**
 * @author ZH
 * @category 审批状态实体类
 */
public class ApproveState {

	/**
	 * 审批状态编号
	 */
	private int approveStateId;
	/**
	 * 审批状态
	 */
	private String approveState;
	
	
	public ApproveState() {
		super();
	}


	public int getApproveStateId() {
		return approveStateId;
	}


	public void setApproveStateId(int approveStateId) {
		this.approveStateId = approveStateId;
	}


	public String getApproveState() {
		return approveState;
	}


	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}
	
	
}
