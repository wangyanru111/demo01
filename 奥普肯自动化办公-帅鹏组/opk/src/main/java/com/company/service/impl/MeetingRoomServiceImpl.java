package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.MeetingRoomDao;
import com.company.pojo.MeetingRoom;
import com.company.service.MeetingRoomService;

/**
 * @author ZH
 * @category 会议室业务逻辑实现类
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

	@Autowired
	private MeetingRoomDao roomDao;

	/**
	 * 根据会议室id查找会议室
	 * 
	 * @param roomId
	 *            会议室编号
	 * @return 会议室集合
	 */
	@Override
	public MeetingRoom findMeetingRoomById(String roomId) {
		int roomid = Integer.valueOf(roomId);
		MeetingRoom meetingRoom = roomDao.findMeetingRoomById(roomid);
		return meetingRoom;
	}

	/**
	 * 根据会议室状态id查找会议室
	 * 
	 * @param requestStateId
	 *            申请状态编号
	 * @return 会议室集合
	 */
	@Override
	public List<MeetingRoom> findMeetingRoomByRSId(String requestStateId) {
		int rsId = Integer.valueOf(requestStateId);
		List<MeetingRoom> list = roomDao.findMeetingRoomByRSId(rsId);
		return list;
	}

	/**
	 * 查找所有的会议室
	 * 
	 * @return 会议室集合
	 */
	@Override
	public List<MeetingRoom> findMeetingRoomAll() {
		List<MeetingRoom> list = roomDao.findMeetingRoomAll();
		return list;
	}

	/**
	 * 更新会议室(状态)
	 * 
	 * @param mr
	 *            会议室对象
	 * @return 更新结果
	 */
	@Override
	public boolean updateMeetingRoom(MeetingRoom mr) {
		return roomDao.updateMeetingRoom(mr) > 0 ? true : false;
	}

	/**
	 * 删除会议室通过会议室id
	 * 
	 * @param roomId
	 *            会议室编号
	 * @return 删除结果
	 */
	@Override
	public boolean deleteMeetingRoomById(String roomId) {
		int roomid = Integer.valueOf(roomId);
		return roomDao.deleteMeetingRoomById(roomid) > 0 ? true : false;
	}

	/**
	 * 添加会议室
	 * 
	 * @param mr
	 *            会议室对象
	 * @return 添加结果
	 */
	@Override
	public boolean addMeetingRoom(MeetingRoom mr) {
		return roomDao.addMeetingRoom(mr) > 0 ? true : false;
	}

	@Override
	public boolean updateRequest(int roomId, int requestStateId) {
		return roomDao.updateRequest(roomId, requestStateId) > 0 ? true : false;
	}

}
