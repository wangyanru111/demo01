package com.company.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Dept;
import com.company.pojo.EmpLevel;
import com.company.pojo.Job;
import com.company.pojo.Meeting;
import com.company.pojo.User;
import com.company.service.DeptService;
import com.company.service.EmpLeveService;
import com.company.service.JobService;
import com.company.service.MeetingService;
import com.company.service.UserService;

@Controller
public class UserController {
	@Resource
	UserService userService;
	@Resource
	private final EmpLeveService empLeveService = null;
	@Resource
	private final JobService jobService = null;
	@Resource
	private final DeptService deptService = null;
	@Resource
	private MeetingService meetingService;
	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public String login(String name, String pass, HttpServletRequest request) {
		User user = userService.findUserByName(name, pass);
		if (user != null) {
			HttpSession session = request.getSession();		
			session.setAttribute("current_user", user);
			return "main";
		} else {
			return "login";
		}
	}
	
	/**
	 * 用户管理之用户列表展示
	 */
	@RequestMapping("/userlist")
	public String userlist(Model model) {
		List<User> list = userService.findUserAll();
		model.addAttribute("list", list);
		return "userlist";
	}
	
	/**
	 * 获取注册界面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/registerpage")
	public String registPage(Model model){	
		List<EmpLevel> empLevels = empLeveService.findELAll();
		List<Dept> depts = deptService.findAll();
		List<Job> jobs = jobService.findJobAll();
		model.addAttribute("empLevels", empLevels);
		model.addAttribute("depts", depts);
		model.addAttribute("jobs", jobs);
		return "register";
	}
	
	/**
	 * 注册
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(User user) {
		boolean flag;
		
		user.setInputDate(new Date());
	flag=	userService.regist(user);
	if(flag){
		return "forward:/userlist.action";
	}else {
		return "forward:/error.action";
	}	
	}
	/**
	 * 404错误界面
	 */
	@RequestMapping("/error")
	public String error(){
		return "error";
	}
	
	/**
	 * 首页用户详情展示
	 */
	@RequestMapping("/index")
	public String index(int uId, Model model) {
		String uid = String.valueOf(uId);
		User user = userService.findUserByUId(uid);
		model.addAttribute("user", user);
		return "index";

	}
	/**
	 * 用户删除
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(String uId){
		userService.deleteUser(uId);
		
		return "redirect:userlist.action";
		
	}
	/**
	 * 批量删除
	 */
	@RequestMapping("/detelearray")
	public String deteleList(int[] uIds){
		userService.deleteArray(uIds);
		
		return "redirect:userlist.action";
	}
	
	@RequestMapping("/information")
	public String information(Model model) {
		List<Meeting> meetinglist = meetingService.findMeetionAll();
		model.addAttribute("meetinglist", meetinglist);
		return "information";
	}
}
