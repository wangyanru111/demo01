package com.company.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.MeetingDao;
import com.company.pojo.Meeting;
import com.company.service.MeetingService;

/**
 * @author ZH
 * @category 会议业务逻辑实现类
 */
@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;

	/**
	 * 查询所有会议
	 * 
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionAll() {
		List<Meeting> list = meetingDao.findMeetionAll();
		return list;
	}

	/**
	 * 通过会议主席查找会议
	 * 
	 * @param uId
	 *            会议主席编号
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionByChairman(String chairman) {
		int uId = Integer.valueOf(chairman);
		List<Meeting> list = meetingDao.findMeetionByChairman(uId);
		return list;
	}

	/**
	 * 通过会议记录人查找会议
	 * 
	 * @param uId
	 *            会议记录人编号
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionByRecorder(String recorder) {
		int uId = Integer.valueOf(recorder);
		List<Meeting> list = meetingDao.findMeetionByRecorder(uId);
		return list;
	}

	/**
	 * 通过会议id查找会议
	 * 
	 * @param mId
	 *            会议编号
	 * @return 会议对象
	 */
	@Override
	public Meeting findMeetionByMId(String mId) {
		int mid = Integer.valueOf(mId);
		Meeting meeting = meetingDao.findMeetionByMId(mid);
		return meeting;
	}

	/**
	 * 通过会议主题模糊查询会议(ajax)
	 * 
	 * @param theme
	 *            会议主题
	 * @return 会议列表
	 */
	@Override
	public List<Meeting> findMeetionByTheme(String theme) {
		List<Meeting> list = meetingDao.findMeetionByTheme(theme);
		return list;
	}

	/**
	 * 根据会议时间段查找会议
	 * 
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionByDate(Date startDate, Date endDate) {
		List<Meeting> list = meetingDao.findMeetionByDate(startDate, endDate);
		return list;
	}

	/**
	 * 根据会议时间段和会议主席查找会议
	 * 
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @param uid
	 *            会议主席编号
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionDateAndChairman(String chairman, Date startDate, Date endDate) {
		return null;
	}

	/**
	 * 根据会议时间段和会议纪要人查找会议
	 * 
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @param uid
	 *            会议记录员编号
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionDateAndRecorder(String recorder, Date startDate, Date endDate) {
		return null;
	}

	/**
	 * 根据会议时间段、会议主席以及会议纪要人查找会议
	 * 
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @param chairman
	 *            会议主席
	 * @param recorder
	 *            会议记录员
	 * @return 会议集合
	 */
	@Override
	public List<Meeting> findMeetionDateAndRecorderAndChairman(String chairman, String recorder, Date startDate,
			Date endDate) {
		return null;
	}

	@Override
	public boolean updateMeeting(Meeting meeting) {

		return meetingDao.updateMeeting(meeting) > 0 ? true : false;
	}

	@Override
	public boolean addMeeting(Meeting meeting) {
		return meetingDao.addMeeting(meeting) > 0 ? true : false;
	}

	@Override
	public boolean updateApprove(int approveStateId, int mId) {
		if (approveStateId != 0 && mId != 0) {
			return meetingDao.updateApprove(approveStateId, mId) > 0 ? true : false;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteMeetingByMid(int mId) {
		return meetingDao.deleteMeetingByMid(mId) > 0 ? true : false;
	}

	@Override
	public boolean updateContent(String content, int mId) {

		return meetingDao.updateContent(content, mId) > 0 ? true : false;
	}

}
