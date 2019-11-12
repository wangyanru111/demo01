package com.company.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.MeetingRoom;
import com.company.service.MeetingRoomService;

/**
 * @author ZH
 * @category 会议室控制器
 */
@Controller
public class MeetingRoomController {

	@Resource
	private MeetingRoomService roomService;

	@RequestMapping("/roomlist")
	public String roomlist(Model model) {
		List<MeetingRoom> roomList = roomService.findMeetingRoomAll();
		model.addAttribute("roomList", roomList);
		return "meetingroom";
	}

	@RequestMapping("/requestroom")
	public String requestroom(String roomId, String requestStateId) {
		int room = Integer.valueOf(roomId);
		int rId = Integer.valueOf(requestStateId);
		rId = 2;
		roomService.updateRequest(room, rId);
		return "redirect:roomlist.action";
	}

	@RequestMapping("/agreeroom")
	public String agreeroom(String roomId, String requestStateId) {
		int room = Integer.valueOf(roomId);
		int rId = Integer.valueOf(requestStateId);
		rId = 3;
		roomService.updateRequest(room, rId);
		return "redirect:roomlist.action";
	}

	@RequestMapping("/rejectroom")
	public String rejectroom(String roomId, String requestStateId) {
		int room = Integer.valueOf(roomId);
		int rId = Integer.valueOf(requestStateId);
		rId = 1;
		roomService.updateRequest(room, rId);
		return "redirect:roomlist.action";
	}
	@RequestMapping("/backroom")
	public String backroom(String roomId, String requestStateId) {
		int room = Integer.valueOf(roomId);
		int rId = Integer.valueOf(requestStateId);
		rId = 1;
		roomService.updateRequest(room, rId);
		return "redirect:roomlist.action";
	}
}
