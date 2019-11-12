package com.company.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.service.UserService;
import com.company.vo.UserVo;

public class Test1 {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserService userService =context.getBean(UserService.class);
		for (UserVo userVo : userService.findUserVoByDidNoLeader("4")) {
			if(userVo.getAssess() != null){
				System.out.println(userVo.getAssess().getAssessContext());	
			}		
		}

	}
}
