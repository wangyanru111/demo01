package com.company.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.AssessDao;
import com.company.dao.GradeDao;
import com.company.dao.UserDao;
import com.company.pojo.Assess;
import com.company.pojo.Grade;
import com.company.pojo.User;
import com.company.service.AssessService;
import com.company.vo.AssessVo;

/**
 * @author ZH
 * @category 员工考核业务逻辑实现类
 */
@Service
public class AssessServiceImpl implements AssessService {

	@Resource
	private AssessDao assessDao;
	@Resource
	private UserDao userDao;
	@Resource
	private GradeDao gradeDao;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 查找所有的人员考核
	 * 
	 * @return 考核集合
	 */
	@Override
	public List<AssessVo> findAssAll() {
		List<Assess> list = assessDao.findAssAll();
		List<AssessVo> listVo = this.toAssessVo(list);
		return listVo;
	}

	/**
	 * 根据考核id查找考核
	 * 
	 * @param aId
	 *            考核编号
	 * @return 考核对象
	 */
	@Override
	public AssessVo findAssByAId(String aId) {
		int aid = 0;
		List<Assess> list = new ArrayList<>();
		if (aId != null) {
			aid = Integer.valueOf(aId);
		}
		list.add(assessDao.findAssByAId(aid));
		List<AssessVo> listVo = this.toAssessVo(list);
		if (listVo.size() == 1) {
			return listVo.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 根据考核等级查找考核信息
	 * 
	 * @param gradeId
	 *            考核等级编号
	 * @return 考核集合
	 */
	@Override
	public List<AssessVo> findAssByGId(String gradeId) {
		int gId = 0;
		if (gradeId != null) {
			gId = Integer.valueOf(gradeId);
		}
		List<Assess> list = assessDao.findAssByGId(gId);
		List<AssessVo> listVo = this.toAssessVo(list);
		return listVo;
	}

	/**
	 * 根据用户id查找用户考核信息
	 * 
	 * @param uId
	 *            用户编号
	 * @return 考核对象
	 */
	@Override
	public List<AssessVo> findAssByUId(String uId) {
		int uid = 0;
		if (uId != null) {
			uid = Integer.valueOf(uId);
		}
		List<Assess> list = assessDao.findAssByUId(uid);
		List<AssessVo> listVo = this.toAssessVo(list);
		return listVo;
	}

	/**
	 * 根据时间段查找考核
	 * 
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @return 考核集合
	 */
	@Override
	public List<AssessVo> findAssByDate(Date startDate, Date endDate) {
		List<Assess> list = assessDao.findAssByDate(startDate, endDate);
		List<AssessVo> listVo = this.toAssessVo(list);
		return listVo;
	}

	@Override
	public List<AssessVo> findAssByDateAndUId(String uId, Date startDate, Date endDate) {
		// 查找指定时间段的考核
		List<Assess> listTemp = this.assessDao.findAssByDate(startDate, endDate);
		// 存放指定时间段内指定人员的考核
		List<Assess> list = new ArrayList<>();
		// String to int
		int uIdInt = 0;
		if (uId != null) {
			uIdInt = Integer.valueOf(uIdInt);
		}
		// 将指定之间段内指定人员的考核取出
		for (Assess assess : listTemp) {
			if (uIdInt == assess.getuId()) {
				list.add(assess);
			}
		}
		// 将考核转化成考核vo
		List<AssessVo> listVos = this.toAssessVo(list);
		// 返回考核vo
		return listVos;
	}

	@Override
	public List<AssessVo> findAssByDateAndGId(String gradeId, Date startDate, Date endDate) {
		// 查找指定时间段的考核
		List<Assess> listTemp = this.assessDao.findAssByDate(startDate, endDate);
		// 存放指定时间段内指定考核等级的考核
		List<Assess> list = new ArrayList<>();
		// String to int
		int gradeIdInt = 0;
		if (gradeId != null) {
			gradeIdInt = Integer.valueOf(gradeId);
		}
		// 将指定之间段内指定考核等级的考核取出
		for (Assess assess : listTemp) {
			if (gradeIdInt == assess.getaId()) {
				list.add(assess);
			}
		}
		// 将考核转化成考核vo
		List<AssessVo> listVos = this.toAssessVo(list);
		// 返回考核vo
		return listVos;
	}

	/**
	 * 根据用户id删除考核
	 * 
	 * @param uId
	 *            用户编号
	 * @return 删除结果
	 */
	@Override
	public boolean deleteAssByUId(String uId) {
		int uid = 0;
		if (uId != null) {
			uid = Integer.valueOf(uId);
		}
		return assessDao.deleteAssByUId(uid) > 0 ? true : false;
	}

	/**
	 * 根据考核id删除考核
	 * 
	 * @param aId
	 *            考核编号
	 * @return 删除结果
	 */
	@Override
	public boolean deleteAssByAId(String aId) {
		int aid = 0;
		if (aId != null) {
			aid = Integer.valueOf(aId);
		}
		return assessDao.deleteAssByAId(aid) > 0 ? true : false;
	}

	/**
	 * 更新考核信息
	 * 
	 * @param assess
	 *            考核对象
	 * @return 更新结果
	 */
	@Override
	public boolean updateAss(Assess assess) {
		if (assess != null) {
			Assess assessOld = assessDao.findAssByDateAndUId(assess.getuId(), this.getStartDate(), this.getEndDate());
			assess.setaId(assessOld.getaId());
			assess.setAssessContext(assessOld.getAssessContext() + "\n" + assess.getAssessContext());
			return assessDao.updateAss(assess) > 0 ? true : false;
		} else {
			return false;
		}
	}

	/**
	 * 增加一条考核
	 * 
	 * @param assess
	 *            考核对象
	 * @return 增加结果
	 */
	@Override
	public boolean addAss(Assess assess) {
		if (assess != null) {
			return assessDao.addAss(assess) > 0 ? true : false;
		} else {
			return false;
		}
	}

	private Date getStartDate() {
		Date date = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		String startDate = calendar.get(Calendar.YEAR) + "-01" + "-01";
		System.out.println(startDate);
		try {
			date = sdf.parse(startDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	private Date getEndDate() {
		Date date = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		String endDate = (calendar.get(Calendar.YEAR) + 1) + "-01" + "-01";
		System.out.println(endDate);
		try {
			date = sdf.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	private List<AssessVo> toAssessVo(List<Assess> assesss) {
		// 创建考核vo集合
		List<AssessVo> assessVos = new ArrayList<>();
		// 遍历考核
		for (Assess assess : assesss) {
			// 创建考核vo
			AssessVo assessVo = new AssessVo();
			User user = userDao.findUserByUid(assess.getuId());
			Grade grade = gradeDao.findGradeByGId(assess.getGradeId());
			assessVo.setuId(user.getuId());
			assessVo.setuName(user.getuName());
			assessVo.setAge(user.getAge());
			assessVo.setEmpLevel(user.getEmpLevel().getLevel());
			assessVo.setDaptName(user.getDept().getdName());
			assessVo.setInputDate(user.getInputDate());
			assessVo.setJob(user.getJob().getJob());
			assessVo.setSex(user.getSex());
			assessVo.setAssess(assess);
			assessVo.setGrade(grade);
			assessVos.add(assessVo);
		}
		return assessVos;
	}
}
