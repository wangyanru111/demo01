package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.GradeDao;
import com.company.pojo.Grade;
import com.company.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {
	@Resource
	GradeDao gradedao;

	@Override
	public List<Grade> findGradeAll() {
		return gradedao.findGradeAll();
	}

	@Override
	public Grade findGradeByGId(String gradeId) {
		int grade = Integer.valueOf(gradeId);

		return gradedao.findGradeByGId(grade);
	}

}
