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
import com.company.pojo.Project;
import com.company.pojo.ProjectType;
import com.company.pojo.User;
import com.company.service.DeptService;
import com.company.service.ProjectService;
import com.company.service.ProjectTypeService;

@Controller
public class ProjectController {
	@Resource
	ProjectService projectService;
	@Resource
	ProjectTypeService projectTypeService;

	@Resource
	DeptService deptService;

	/**
	 * 项目列表展示
	 */
	@RequestMapping("/projectlist")
	public String projectlist(Model model, HttpServletRequest request) {
		List<Project> list = projectService.findProAll();
		model.addAttribute("list", list);

		return "projectlist";
	}

	/**
	 * 创建项目页面
	 */
	@RequestMapping("/createprojectpage")
	public String createprojectpage(Model model) {
		List<ProjectType> list = projectTypeService.findProTypeAll();
		List<Dept> list1 = deptService.findAll();
		model.addAttribute("list", list);
		model.addAttribute("list1", list1);
		return "createprojectpage";
	}

	/**
	 * 创建项目
	 */
	@RequestMapping("/createproject")
	public String createproject(Project project) {
		project.setCreateDate(new Date());
		project.setStateId(1);
		project.setApproveStateId(1);
		projectService.addPro(project);
		return "redirect:projectlist.action";
	}

	/**
	 * 项目列表删除
	 */
	@RequestMapping("/deleteProject")
	public String deleteUser(String pId) {

		projectService.deleteProByPId(pId);

		return "redirect:projectlist.action";
	}

	/**
	 * 展示项目详情信息(审批用)
	 */
	@RequestMapping("/projectdetail")
	public String projectdetail(String pId, Model model) {
		Project project = projectService.findProByPId(pId);
		model.addAttribute("project", project);
		return "projectdetail";
	}

	/**
	 * 展示项目详情信息(查看用)
	 */
	@RequestMapping("/showprojectdetail")
	public String showprojectdetail(String pId, Model model) {
		Project project = projectService.findProByPId(pId);
		model.addAttribute("project", project);
		return "showprojectdetail";
	}

	/**
	 * 提交项目修改项目状态
	 */
	@RequestMapping("/submit")
	public String submit(String pId, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("current_user");
		if (user.getuId() == 2) {
			int pid = Integer.valueOf(pId);
			projectService.submitproject(2, pid);
			return "redirect:projectlist.action";
		} else if (user.getuId() == 3) {
			int pid = Integer.valueOf(pId);
			projectService.submitproject(3, pid);
			return "redirect:projectlist.action";
		} else {
			int pid = Integer.valueOf(pId);
			projectService.submitproject(4, pid);
			return "redirect:projectlist.action";
		}
	}

	/**
	 * 领导审批修改项目状态
	 */
	@RequestMapping("/approve")
	public String approve(String pId, String approveStateId) {
		int aproid = Integer.valueOf(approveStateId);
		if (aproid == 2) {
			int pid = Integer.valueOf(pId);
			projectService.submitproject(3, pid);
			return "redirect:projectlist.action";
		} else if (aproid == 3) {
			int pid = Integer.valueOf(pId);
			projectService.submitproject(4, pid);
			return "redirect:projectlist.action";
		}
		return "redirect:projectlist.action";
	}

	/**
	 * 审批修改项目状态（驳回）
	 */
	@RequestMapping("/decline")
	public String decline(String pId) {
		int pid = Integer.valueOf(pId);
		projectService.submitproject(5, pid);

		return "redirect:projectlist.action";
	}

	/**
	 * 撤销项目
	 */
	@RequestMapping("/cancel")
	public String cancel(String pId) {
		int pid = Integer.valueOf(pId);
		projectService.submitproject(6, pid);
		return "redirect:projectlist.action";
	}

	/**
	 * 项目进度管理主页面
	 */
	@RequestMapping("/projectmanagement")
	public String projectmanagement(Model model) {
		List<Project> list = projectService.findProByASid("4");
		model.addAttribute("list", list);
		return "projectmanagement";
	}

	/**
	 * 进度管理更改页面
	 */
	@RequestMapping("/management")
	public String management(String pId, Model model) {
		Project project = projectService.findProByPId(pId);
		model.addAttribute("project", project);
		return "management";
	}

	/**
	 * 管理项目状态（更新stateId）
	 */
	@RequestMapping("/updatestateid")
	public String updatestateid(String pId, String stateId) {
		projectService.updatePro(pId, stateId);
		return "redirect:projectmanagement.action";
	}

	/**
	 * 批量删除
	 */
	@RequestMapping("deletepro")
	public String deletePro(int[] pIds) {

		projectService.deletePro(pIds);
		return "redirect:projectlist.action";
	}

	/**
	 * 批量删除
	 */
	@RequestMapping("search")
	public String search(String pName, Model model) {
		List<Project> list = projectService.findProByPName(pName);
		model.addAttribute("list", list);
		return "projectlist";
	}

}