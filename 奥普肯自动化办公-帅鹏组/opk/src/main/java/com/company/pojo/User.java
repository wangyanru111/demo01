package com.company.pojo;

import java.util.Date;

/**
 * 
 * @author gong
 * @category 用户实体类
 *
 */

public class User {
	/**
	 * 用户Id
	 */
	private int uId;
	/**
	 * 部门Id
	 */
	private int dId;
	/**
	 * 职级编号
	 */
	private int lId;
	/**
	 * 职位编号
	 */

	private int jobId;
	/**
	 * 用户名
	 */
	private String uName;
	/**
	 * 用户密码
	 */
	private String pass;
	/**
	 * 二级密码
	 */
	private String spass;
	/**
	 * 性别
	 */
	private char sex;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 
	 */
	private String tel;
	/**
	 * 日期
	 */
	private Date inputDate;
	
	/**
	 * 部门
	 */
	private Dept dept;
	/**
	 * 职级
	 */
	private EmpLevel empLevel;
	/**
	 * 职位
	 */
	private Job job;
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public EmpLevel getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(EmpLevel empLevel) {
		this.empLevel = empLevel;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public User() {
		super();
	}

	public User(int uId, int dId, int lId, int jobId, String uName, String pass, String spass, char sex, int age,
			String tel, Date inputDate) {
		super();
		this.uId = uId;
		this.dId = dId;
		this.lId = lId;
		this.jobId = jobId;
		this.uName = uName;
		this.pass = pass;
		this.spass = spass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.inputDate = inputDate;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
}	
