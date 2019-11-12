package com.company.pojo;

/**
 * @author ZH
 * @category 会议室实体类
 */
public class MeetingRoom {

	/**
	 * 会议室编号
	 */
	private int roomId;
	/**
	 * 使用状态编号
	 */
	private int requestStateId;
	/**
	 * 会议室
	 */
	private String roomName;
	
	private RequestState requestState;
	
	public MeetingRoom() {
		super();
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	

	public int getRequestStateId() {
		return requestStateId;
	}

	public void setRequestStateId(int requestStateId) {
		this.requestStateId = requestStateId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public RequestState getRequestState() {
		return requestState;
	}

	public void setRequestState(RequestState requestState) {
		this.requestState = requestState;
	}
	
	
}
