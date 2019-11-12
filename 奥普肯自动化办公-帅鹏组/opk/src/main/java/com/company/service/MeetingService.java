package com.company.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Meeting;

public interface MeetingService {
	/**
	 * 查询所有会议
	 * 
	 * @return
	 */
	public List<Meeting> findMeetionAll();

	/**
	 * 通过会议主席查找会议
	 * 
	 * @param uId
	 * @return
	 */
	public List<Meeting> findMeetionByChairman(String chairman);

	/**
	 * 通过会议记录人查找会议
	 * 
	 * @param uId
	 * @return
	 */
	public List<Meeting> findMeetionByRecorder(String recorder);

	/**
	 * 通过会议id查找会议
	 * 
	 * @param mId
	 * @return
	 */
	public Meeting findMeetionByMId(String mId);

	/**
	 * 通过会议主题模糊查询会议(ajax)
	 * 
	 * @param theme
	 * @return
	 */
	public List<Meeting> findMeetionByTheme(String theme);

	/**
	 * 根据会议时间段查找会议
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Meeting> findMeetionByDate(Date startDate, Date endDate);

	/**
	 * 根据会议时间段和会议主席查找会议
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Meeting> findMeetionDateAndChairman(String chairman, Date startDate, Date endDate);

	/**
	 * 根据会议时间段和会议纪要人查找会议
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Meeting> findMeetionDateAndRecorder(String recorder, Date startDate, Date endDate);

	/**
	 * 根据会议时间段、会议主席以及会议纪要人查找会议
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Meeting> findMeetionDateAndRecorderAndChairman(String chairman, String recorder, Date startDate,
			Date endDate);

	/**
	 * 更新会议(更新会议内容仅限会议召开时间之前)
	 * 
	 * @param meeting
	 * @return
	 */
	public boolean updateMeeting(Meeting meeting);

	/**
	 * 添加会议
	 * 
	 * @param meeting
	 * @return
	 */
	public boolean addMeeting(Meeting meeting);

	/**
	 * @param approveStateId
	 * @param mId
	 * @return
	 */
	public boolean updateApprove(int approveStateId, int mId);

	/**
	 * 通过会议编号删除会议记录
	 * 
	 * @param mId
	 * @return
	 */
	public boolean deleteMeetingByMid(int mId);

	/**
	 * 更新会议纪要
	 * @param approveStateId 会议纪要
	 * @return 更新结果
	 */
	public boolean updateContent(String content,int mId);
}
