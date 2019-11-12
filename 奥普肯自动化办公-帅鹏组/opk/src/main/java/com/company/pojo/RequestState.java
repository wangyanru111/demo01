package com.company.pojo;

/**
 * @author ZH
 * @category 状态实体类
 */
public class RequestState {

	/**
	 * 状态编号
	 */
	private int requestStateId;
	/**
	 * 状态
	 */
	private String requestState;
	
	public RequestState() {
		super();
	}

	public int getRequestStateId() {
		return requestStateId;
	}

	public void setRequestStateId(int requestStateId) {
		this.requestStateId = requestStateId;
	}

	public String getRequestState() {
		return requestState;
	}

	public void setRequestState(String requestState) {
		this.requestState = requestState;
	}

	
	
	
}
