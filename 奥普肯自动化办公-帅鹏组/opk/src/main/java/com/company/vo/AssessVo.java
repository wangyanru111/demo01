package com.company.vo;

import java.util.Date;

import com.company.pojo.Assess;
import com.company.pojo.Grade;

public class AssessVo {
	/**
	 * 用户Id
	 */
	private int uId;
	/**
	 * 用户名
	 */
	private String uName;
	/**
	 * 项目名
	 */
	private String daptName;
	/**
	 * 职级
	 */
	private String empLevel;
	/**
	 * 职位
	 */
	private String job;
	/**
	 * 性别
	 */
	private char sex;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 日期
	 */
	private Date inputDate;	
	
	/**
	 * 考核状态
	 */
	private Assess assess;
	
	private Grade grade;
	
	public AssessVo() {
		super();
	}
	public AssessVo(int uId, String uName, String daptName, String empLevel, String job, char sex, int age,
			Date inputDate) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.daptName = daptName;
		this.empLevel = empLevel;
		this.job = job;
		this.sex = sex;
		this.age = age;
		this.inputDate = inputDate;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getDaptName() {
		return daptName;
	}
	public void setDaptName(String daptName) {
		this.daptName = daptName;
	}
	public String getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(String empLevel) {
		this.empLevel = empLevel;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public Assess getAssess() {
		return assess;
	}
	public void setAssess(Assess assess) {
		this.assess = assess;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
