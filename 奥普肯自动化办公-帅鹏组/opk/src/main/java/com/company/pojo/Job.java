package com.company.pojo;

public class Job {
	
	/**
	 * 职位编号
	 */
	private int jobId;
	
	/**
	 * 职位名称
	 */
	private String job;

	public Job(int jobId, String job) {
		super();
		this.jobId = jobId;
		this.job = job;
	}

	public Job() {
		super();
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
