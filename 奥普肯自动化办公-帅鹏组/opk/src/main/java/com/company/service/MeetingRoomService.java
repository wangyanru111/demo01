package com.company.service;

import java.util.List;

import com.company.pojo.MeetingRoom;

/**
 * @author lsp
 * @category 会议室service接口
 *
 */
public interface MeetingRoomService {
	/**
	 * 根据会议室id查找会议室
	 * 
	 * @param roomId
	 * @return
	 */
	public MeetingRoom findMeetingRoomById(String roomId);

	/**
	 * 根据会议室状态id查找会议室
	 * 
	 * @param requestStateId
	 * @return
	 */
	public List<MeetingRoom> findMeetingRoomByRSId(String requestStateId);

	/**
	 * 查找所有的会议室
	 * 
	 * @return
	 */
	public List<MeetingRoom> findMeetingRoomAll();

	/**
	 * 更新会议室(状态)
	 * 
	 * @param mr
	 * @return
	 */
	public boolean updateMeetingRoom(MeetingRoom mr);

	/**
	 * 删除会议室通过会议室id
	 * 
	 * @param roomId
	 * @return
	 */
	public boolean deleteMeetingRoomById(String roomId);

	/**
	 * 添加会议室
	 * 
	 * @param mr
	 * @return
	 */
	public boolean addMeetingRoom(MeetingRoom mr);

	/**
	 * 根据会议室编号修改会议室使用状态
	 * 
	 * @param roomId
	 * @param requestStateId
	 * @return
	 */
	public boolean updateRequest(int roomId, int requestStateId);
}
