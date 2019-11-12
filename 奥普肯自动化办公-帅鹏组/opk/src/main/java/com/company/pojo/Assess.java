package com.company.pojo;

import java.util.Date;

/**
 * @author ZH
 * @category 人员考核实体类
 */
public class Assess {

	/**
	 * 考核编号
	 */
	private int aId;
	/**
	 * 员工编号
	 */
	private int uId;
	/**
	 * 考核等级
	 */
	private int gradeId;
	/**
	 * 考评
	 */
	private String assessContext;
	/**
	 * 考核日期
	 */
	private Date assessDate;
		
	private User user;
	
	private Grade grade;
	
	public Assess() {
		super();
	}
	
	

	public Assess(int uId, int gradeId, String assessContext, Date assessDate) {
		super();
		this.uId = uId;
		this.gradeId = gradeId;
		this.assessContext = assessContext;
		this.assessDate = assessDate;
	}



	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}


	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public Date getAssessDate() {
		return assessDate;
	}

	public void setAssessDate(Date assessDate) {
		this.assessDate = assessDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getAssessContext() {
		return assessContext;
	}

	public void setAssessContext(String assessContext) {
		this.assessContext = assessContext;
	}
}
