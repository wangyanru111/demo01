package com.company.pojo;
/**
 * 
 * @author gong
 * @category 员工薪酬实体类
 *
 */

public class Salary {
	/**
	 * 职级编号
	 */
	private int lId;
	/**
	 * 薪资
	 */
	private double sal;
	/**
	 * 职位编号
	 */
	private int jobId;
	/**
	 * 薪酬Id
	 */
	private int id;

	private EmpLevel empLevel;
	private Job job;
	
	public Salary() {
		super();
	}

	public Salary(int lId, double sal, int jobId, int id) {
		super();
		this.lId = lId;
		this.sal = sal;
		this.jobId = jobId;
		this.id = id;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
