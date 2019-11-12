package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Meeting;

/**
 * @author lsp
 * @category 会议Dao接口
 */
public interface MeetingDao {
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
	public List<Meeting> findMeetionByChairman(int chairman);

	/**
	 * 通过会议记录人查找会议
	 * 
	 * @param uId
	 * @return
	 */
	public List<Meeting> findMeetionByRecorder(int recorder);

	/**
	 * 通过会议id查找会议
	 * 
	 * @param mId
	 * @return
	 */
	public Meeting findMeetionByMId(int mId);

	/**
	 * 通过会议主题模糊查询会议(ajax)
	 * 
	 * @param theme
	 * @return
	 */
	public List<Meeting> findMeetionByTheme(@Param(value = "theme")String theme);

	/**
	 * 根据会议时间段查找会议
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<Meeting> findMeetionByDate(@Param(value = "startDate") Date startDate,
			@Param(value = "endDate") Date endDate);

	/**
	 * 更新会议(更新会议内容仅限会议召开时间之前)
	 * 
	 * @param meeting
	 * @return
	 */
	public int updateMeeting(Meeting meeting);

	/**
	 * 添加会议
	 * 
	 * @param meeting
	 * @return
	 */
	public int addMeeting(Meeting meeting);
	
	/**
	 * 更新会议审批状态
	 * @param approveStateId 审批状态
	 * @return 更新结果
	 */
	public int updateApprove(@Param("approveStateId")int approveStateId,@Param("mId")int mId);
	
	/**
	 * 通过会议编号删除会议记录
	 * @param mId 会议编号
	 * @return 删除结果
	 */
	public int deleteMeetingByMid(int mId);
	
	/**
	 * 更新会议纪要
	 * @param approveStateId 会议纪要
	 * @return 更新结果
	 */
	public int updateContent(@Param("content")String content,@Param("mId")int mId);
}
