package com.company.pojo;

/**
 * @author ZH
 * @category 考核等级实体类
 */
public class Grade {

	/**
	 * 登记编号
	 */
	private int gradeId;
	/**
	 * 等级
	 */
	private String grade;
	
	public Grade() {
		super();
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
