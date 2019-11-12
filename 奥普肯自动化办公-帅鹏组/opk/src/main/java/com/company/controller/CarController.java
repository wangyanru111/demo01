package com.company.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.CarType;
import com.company.pojo.Cars;
import com.company.pojo.Office;
import com.company.service.CarTypeService;
import com.company.service.CarsService;

/**
 * 
 * @author ����¤
 */
@Controller
public class CarController {
	@Resource
	CarsService carsService;
	@Resource
	CarTypeService cartypeService;

	/**
	 * 车辆资料展示
	 */
	@RequestMapping("/carlist")
	public String carlist(Model model) {
		List<Cars> carlist = carsService.findCarsAll();
		model.addAttribute("carlist", carlist);
		return "carlist";
	}

	/**
	 * 用户删除
	 */
	@RequestMapping("deletecar")
	public String deleteCar(String carId) {
		carsService.deleteCarsById(carId);

		return "redirect:carlist.action";
	}

	/**
	 * 获取用车申请界面
	 */
	@RequestMapping("/carapply")
	public String carapply(Model model) {
		List<CarType> cartype = cartypeService.findCarsTypeAll();
		model.addAttribute("car", cartype);
		return "carapply";
	}

	/**
	 * 用车申请
	 */
	@RequestMapping("carapp")
	public String carapp(Cars cars) {
		carsService.addCars(cars);
		return "redirect:carlist.action";
	}

	/**
	 * 获取审批页面
	 */
	@RequestMapping("updatecar")
	public String updateCar(Model model) {
		List<Cars> listcar = carsService.findCarsAll();
		List<CarType> carty = cartypeService.findCarsTypeAll();
		model.addAttribute("carty", carty);
		model.addAttribute("listcar", listcar);
		return "updatacar";
	}
		/**
		 * 更新页面
		 */
	@RequestMapping("updatecars")
		public String upCars(Cars cars){
		carsService.updateCars(cars);
			return "redirect:carlist.action";
		}
	/**
	 * 批量删除
	 */
	@RequestMapping("deleteCarArray")
	public String  deleteCarArray(int[] carIds){
		carsService.deleteCarArray(carIds);
		
		return "redirect:carlist.action";
	}
}
