package com.company.pojo;

/**
 * 
 * @author gong
 * @category 项目状态实体类
 *
 */

public class ProjectState {
	/**
	 * 状态编号
	 */
	private int stateId;
	/**
	 * 项目状态
	 */
	private String state;

	public ProjectState() {
		super();
	}

	public ProjectState(int stateId, String state) {
		super();
		this.stateId = stateId;
		this.state = state;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
