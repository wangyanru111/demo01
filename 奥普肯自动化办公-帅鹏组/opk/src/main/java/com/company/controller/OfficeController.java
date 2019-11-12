package com.company.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Office;
import com.company.pojo.OfficeType;
import com.company.pojo.User;
import com.company.service.OfficeService;
import com.company.service.OfficeTypeService;

@Controller
public class OfficeController {
	@Resource
	OfficeService officeService;
	@Resource
	OfficeTypeService typeService;
	/**
	 * 办公用品列表展示
	 */
	@RequestMapping("/officelist")
	public String userlist(Model model) {
		List<Office> list =officeService.findOfficeAll();
		model.addAttribute("list", list);
		return "officelist";
	}
  /**
   * 办公用品申购
   */
	@RequestMapping("/officeapp")
	public String registPage(Model model){	
		List<OfficeType> list = typeService.findOfficeTypeAll();
		model.addAttribute("list", list);
		return "officeapply";
	}
	
	@RequestMapping("/officeapply")
	public String regist(Office office) {
		officeService.addOffice(office);
		
		return "redirect:officelist.action";
	}
	/**
	 * 用户列表删除
	 */
	@RequestMapping("/delete")
	public String delete(String oId){
		officeService.deleteOfficeByOId(oId);
		return "redirect:officelist.action";
	}
	/**
	 * 获取更新页面
	 */
	@RequestMapping("updateoffice")
	public String updateOffice(Model model){
		List<Office> update=officeService.findOfficeAll();
		model.addAttribute("update", update);
		
		return "updateOffice";
		
	}
	
	
	
	/**
	 * 更新页面
	 */
	@RequestMapping("update")
	public String update(Office office){
		
		officeService.updateOffice(office);
		return "redirect:officelist.action";
		
	}
	/**
	 * 批量删除
	 */
	@RequestMapping("dedeletearr")
	public String  dedeleteArr(int[] oIds){
		officeService.deleteArr(oIds);
		
		return "redirect:officelist.action";
	}
}
