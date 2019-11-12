package com.company.pojo;

import java.util.Date;

public class Meeting {

	/**
	 * 会议编号
	 */
	private int mId;
	/**
	 * 会议主题
	 */
	private String theme;
	/**
	 * 会议内容
	 */
	private String content;
	/**
	 * 会议时间
	 */
	private Date meetingDate;
	/**
	 * 会议审批状态编号
	 */
	private int approveStateId;

	/**
	 * 记录人编号
	 */
	private int recorder;
	/**
	 * 会议主席
	 */
	private int chairman;
	/**
	 * 会议室编号
	 */
	private int roomId;

	private ApproveState approveState;
	private User chairmanUser;
	private User recorderUser;
	private MeetingRoom meetingRoom;


	public Meeting() {
		super();
	}

	
	public Meeting(String theme, String content, Date meetingDate, int approveStateId, int recorder, int chairman,
			int roomId) {
		super();
		this.theme = theme;
		this.content = content;
		this.meetingDate = meetingDate;
		this.approveStateId = approveStateId;
		this.recorder = recorder;
		this.chairman = chairman;
		this.roomId = roomId;
	}


	public User getChairmanUser() {
		return chairmanUser;
	}

	public void setChairmanUser(User chairmanUser) {
		this.chairmanUser = chairmanUser;
	}

	public User getRecorderUser() {
		return recorderUser;
	}

	public void setRecorderUser(User recorderUser) {
		this.recorderUser = recorderUser;
	}
	
	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public int getApproveStateId() {
		return approveStateId;
	}

	public void setApproveStateId(int approveStateId) {
		this.approveStateId = approveStateId;
	}

	public int getRecorder() {
		return recorder;
	}

	public void setRecorder(int recorder) {
		this.recorder = recorder;
	}

	public int getChairman() {
		return chairman;
	}

	public void setChairman(int chairman) {
		this.chairman = chairman;
	}

	public ApproveState getApproveState() {
		return approveState;
	}

	public void setApproveState(ApproveState approveState) {
		this.approveState = approveState;
	}

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

}
