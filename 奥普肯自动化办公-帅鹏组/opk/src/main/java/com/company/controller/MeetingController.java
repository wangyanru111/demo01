package com.company.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Meeting;
import com.company.pojo.MeetingRoom;
import com.company.pojo.User;
import com.company.service.MeetingRoomService;
import com.company.service.MeetingService;
import com.company.service.UserService;

/**
 * @author ZH
 * @category 会议控制器
 */
@Controller
public class MeetingController {

	@Resource
	private MeetingService meetingService;
	@Resource
	private UserService userService;
	@Resource
	private MeetingRoomService roomService;

	private Meeting meeting = new Meeting();

	/**
	 * 会议列表
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/meetinglist")
	public String meetinglist(Model model, String type) {
		List<Meeting> list = meetingService.findMeetionAll();
		model.addAttribute("list", list);
		if (type.equals("1")) {
			return "meetinglist";
		}else{
			return "meetinglist2";
		}
	}

	@RequestMapping("/searchmeeting")
	public String searchmeeting(Model model, String type,String theme) {
		List<Meeting> list = meetingService.findMeetionByTheme(theme);
		model.addAttribute("list", list);
		if (type.equals("1")) {
			return "meetinglist";
		}else{
			return "meetinglist2";
		}
	}
	/**
	 * 会议发起页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/addmeeting")
	public String addmeeting(Model model) {
		List<User> list = userService.findUserAll();
		List<MeetingRoom> roomlist = roomService.findMeetingRoomAll();
		model.addAttribute("list", list);
		model.addAttribute("roomlist", roomlist);
		return "addmeeting";
	}

	/**
	 * 会议发起保存
	 * 
	 * @param model
	 * @param theme
	 * @param meetingDate
	 * @param chairman
	 * @param recorder
	 * @param roomId
	 * @return
	 */
	@RequestMapping("/meetingsave")
	public String meetingsave(Model model, String theme, String meetingDate, int chairman, int recorder, int roomId) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
			Date date = sdf.parse(meetingDate);
			System.out.println(date);
			meeting.setMeetingDate(date);
			meeting.setApproveStateId(2);
			meeting.setChairman(chairman);
			meeting.setRecorder(recorder);
			meeting.setRoomId(roomId);
			meeting.setTheme(theme);
			meeting.setContent(null);
			meetingService.addMeeting(meeting);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "redirect:meetinglist.action?type=1";
	}

	/**
	 * 会议审批通过
	 * 
	 * @param model
	 * @param meeting
	 * @param mId
	 * @param approveStateId
	 * @return
	 */
	@RequestMapping("/agree")
	public String agree(Model model, Meeting meeting, String mId, String approveStateId) {
		int mid = Integer.valueOf(mId);
		int aid = Integer.valueOf(approveStateId);
		if (aid < 4) {
			aid += 1;
		}
		System.out.println(aid);
		meetingService.updateApprove(aid, mid);
		return "redirect:meetinglist.action?type=1";

	}

	@RequestMapping("/reject")
	public String reject(String mId, String approveStateId) {

		int mid = Integer.valueOf(mId);
		int aid = 5;
		System.out.println(aid);
		meetingService.updateApprove(aid, mid);
		return "redirect:meetinglist.action?type=1";
	}

	@RequestMapping("/back")
	public String back(String mId, String approveStateId) {

		int mid = Integer.valueOf(mId);
		int aid = 6;
		System.out.println(aid);
		meetingService.updateApprove(aid, mid);
		return "redirect:meetinglist.action?type=1";
	}

	@RequestMapping("/complete")
	public String complete(String mId, String approveStateId) {

		int mid = Integer.valueOf(mId);
		int aid = 7;
		System.out.println(aid);
		meetingService.updateApprove(aid, mid);
		return "redirect:meetinglist.action?type=1";
	}

	@RequestMapping("/deletemeeting")
	public String deletemeeting(String mId) {
		int mid = 0;
		if (mId != null) {
			mid = Integer.valueOf(mId);
			meetingService.deleteMeetingByMid(mid);
			return "redirect:meetinglist.action?type=1";
		} else {
			return null;
		}
	}

	@RequestMapping("/meetingcontent")
	public String meetingcontent(Model model, Meeting meeting, String mId) {
		/* int mid = Integer.valueOf(mId); */
		meeting = meetingService.findMeetionByMId(mId);
		model.addAttribute("meeting", meeting);
		return "meetingcontent";
	}
	
	@RequestMapping("/updatecontent")
	public String updatecontent(String mId,String content){
		int mid = Integer.valueOf(mId);
		meetingService.updateContent(content, mid);
		return "redirect:meetinglist.action?type=2";
		
	}
}
