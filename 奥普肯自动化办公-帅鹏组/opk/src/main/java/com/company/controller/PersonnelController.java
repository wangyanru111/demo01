package com.company.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Assess;
import com.company.pojo.Job;
import com.company.pojo.User;
import com.company.service.AssessService;
import com.company.service.GradeService;
import com.company.service.JobService;
import com.company.service.UserService;
import com.company.vo.UserVo;

/**
 * @author lsp
 * @category 人事部门
 * 
 */
@Controller
public class PersonnelController {
	@Resource
	private final UserService userService = null;
	@Resource
	private final JobService jobService = null;
	@Resource
	private final GradeService gradeService = null;
	@Resource
	private final AssessService assessService = null;

	/**
	 * 管理员查看人员考核列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/gradelist")
	public String GradeList(Model model, HttpSession session) {
		// 数据信息
		List<UserVo> userVos = null;
		// 获取当前用户
		User current_user = (User) session.getAttribute("current_user");
		if (current_user != null) {
			// 获取当前用户的职位
			Job job = jobService.findJobBylId(Integer.toString(current_user.getJobId()));
			// 确定角色
			if (job.getJob().equals("系统管理员")) {
				userVos = userService.findUserVoAll();
			} else if (job.getJob().equals("总经理")) {
				userVos = userService.findDeptLeaderVoAll();
			} else if (job.getJob().equals("部门经理")) {
				userVos = userService.findUserVoByDidNoLeader(Integer.toString(current_user.getdId()));
			} else {
				System.out.println("无访问权限");
			}
			// 将数据信息存入model中
			model.addAttribute("userVos", userVos);
			return "gradelist";
		} else {
			return "redirect:/login.action";
		}
	}

	@RequestMapping(value = "/gradepage")
	public String GradePage(String uId, Model model, HttpSession session) {
		// viewPath
		String viewPath = null;
		// 获取当前用户
		User current_user = (User) session.getAttribute("current_user");
		if (current_user != null) {
			model.addAttribute("user", userService.findUserByUId(uId));
			model.addAttribute("grades", gradeService.findGradeAll());
			viewPath = "gradepage";
		}

		return viewPath;
	}

	@RequestMapping(value = "/gradeupdatepage")
	public String GradeUpdatePage(String uId, Model model, HttpSession session) {
		// viewPath
		String viewPath = null;
		// 获取当前用户
		User current_user = (User) session.getAttribute("current_user");
		if (current_user != null) {
			model.addAttribute("userVo", userService.findUserVoByUId(uId));
			model.addAttribute("grades", gradeService.findGradeAll());
			viewPath = "gradeupdatepage";
		}

		return viewPath;
	}

	@RequestMapping(value = "/grade")
	public String Grade(Assess assess, HttpSession session) {
		// viewPath
		String viewPath = null;
		// 获取当前用户
		User current_user = (User) session.getAttribute("current_user");
		if (current_user != null) {
			assess.setAssessDate(new Date());
			if (assess.getGradeId() != 0) {
				assessService.addAss(assess);
			} else {
				System.err.println("未选择考核等级");
			}
			viewPath = "forward:/gradelist.action";
		}
		return viewPath;
	}

	@RequestMapping(value = "/gradeupdate")
	public String GradeUpdate(Assess assess, HttpSession session) {
		// viewPath
		String viewPath = null;
		// 获取当前用户
		User current_user = (User) session.getAttribute("current_user");
		if (current_user != null) {
			assess.setAssessDate(new Date());
			if (assess.getGradeId() != 0) {
				System.out.println(assess.getClass());
				System.out.println(assessService.updateAss(assess));
			} else {
				System.err.println("未选择考核等级");
			}
			viewPath = "forward:/gradelist.action";
		}
		return viewPath;
	}

}
