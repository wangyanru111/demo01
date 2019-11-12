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
import com.company.service.UserService;
import com.company.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Resource
	private AssessDao assessDao;

	@Resource
	private GradeDao gradeDao;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 通过用户名密码查询(登录用)
	 */
	@Override
	public User findUserByName(String name, String pass) {
		User user = userDao.findUserByName(name, pass);
		return user;
	}

	/**
	 * 注册用户
	 */

	@Override
	public boolean regist(User user) {
		boolean flag;
		int o = userDao.regist(user);
		if (o != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	@Override
	public List<User> findUserAll() {
		List<User> list = userDao.findUserAll();
		return list;
	}

	/**
	 * 根据用户id查找用户
	 * 
	 * @param uId
	 * @return
	 */
	@Override
	public User findUserByUId(String uId) {
		int uid = Integer.valueOf(uId);
		User user = userDao.findUserByUid(uid);
		return user;
	}

	/**
	 * 通过部门id查找用户
	 * 
	 * @param dId
	 * @return
	 */
	@Override
	public List<User> findUserByDid(String dId) {
		int dIdInt = 0;
		if (dId != null) {
			dIdInt = Integer.valueOf(dId);
		}
		return userDao.findUserByDid(dIdInt);
	}

	@Override
	public List<User> findUserByDidNoLeader(String dId) {
		List<User> users1 = null;
		List<User> users2 = new ArrayList<>();
		int dIdInt = 0;
		if (dId != null) {
			dIdInt = Integer.valueOf(dId);
		}
		users1 = userDao.findUserByDid(dIdInt);
		// 去除部门经理
		for (User user : users1) {
			if (!(user.getJob().getJob().equals("部门经理")||user.getJob().getJob().equals("总经理"))) {
				System.out.println(user.getuName()+"\t\t"+user.getJob().getJob());
				
				users2.add(user);
			}
		}
		return users2;
	}

	@Override
	public List<User> findUserByJobId(String jobId) {
		int jobIdInt = 0;
		if (jobId != null) {
			jobIdInt = Integer.valueOf(jobId);
		}
		return userDao.findUserByJobId(jobIdInt);
	}

	@Override
	public List<User> findUserByJobIdAndELId(String jobId, String lId) {
		int jobIdInt = 0;
		int lIdInt = 0;
		if (jobId != null || lId != null) {
			jobIdInt = Integer.valueOf(jobId);
			lIdInt = Integer.valueOf(lId);
		}
		return userDao.findUserByJobIdAndELId(jobIdInt, lIdInt);
	}

	@Override
	public List<User> findDeptLeaderAll() {
		// 所有员工
		List<User> list1 = userDao.findUserAll();
		// 所有部门经理
		List<User> list2 = new ArrayList<>();
		// 将所以部门经理提出
		for (User user : list1) {
			if (user.getJobId() == 3) {
				list2.add(user);
			}
		}
		// 返回部门经理
		return list2;
	}

	/**
	 * 通过用户id删除用户
	 * 
	 * @param uId
	 * @return
	 */
	@Override
	public boolean deleteUser(String uId) {
		int uid = Integer.valueOf(uId);
		return userDao.deleteUser(uid) > 0 ? true : false;
	}

	/**
	 * 根据部门id删除用户
	 * 
	 * @param dId
	 * @return
	 */
	@Override
	public boolean deleteUserByDid(String dId) {
		int did = Integer.valueOf(dId);
		return userDao.deleteUserByDid(did) > 0 ? true : false;
	}

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public boolean update(User user) {

		return userDao.upDate(user) > 0 ? true : false;
	}

	@Override
	public boolean deleteArray(int[] uIds) {
		boolean flag;
		int p = userDao.deleteArray(uIds);
		if (p != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public UserVo findUserVoByUId(String uId) {
		List<User> users = new ArrayList<User>();
		int uid = Integer.valueOf(uId);
		User user = userDao.findUserByUid(uid);
		users.add(user);
		List<UserVo> userVos = this.toUserVo(users, this.getStartDate(), this.getEndDate());
		return userVos.get(0);
	}
	
	@Override
	public List<UserVo> findUserVoByDidNoLeader(String dId) {
		List<User> users = this.findUserByDidNoLeader(dId);
		List<UserVo> userVos = this.toUserVo(users, this.getStartDate(), this.getEndDate());
		return userVos;
	}

	@Override
	public List<UserVo> findUserVoAll() {
		List<User> users = this.findUserAll();
		List<UserVo> userVos = this.toUserVo(users, this.getStartDate(), this.getEndDate());
		return userVos;
	}

	@Override
	public List<UserVo> findDeptLeaderVoAll() {
		List<User> users = this.findDeptLeaderAll();
		List<UserVo> userVos = this.toUserVo(users, this.getStartDate(), this.getEndDate());
		return userVos;
	}

	private Date getStartDate() {
		Date date = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		String startDate = calendar.get(Calendar.YEAR)+"-01"+"-01";	
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
		String endDate = (calendar.get(Calendar.YEAR)+1)+"-01"+"-01";
		System.out.println(endDate);
		try {
			date = sdf.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	private List<UserVo> toUserVo(List<User> users, Date startDate, Date endDate) {
		// 创建考核vo集合
		List<UserVo> userVos = new ArrayList<>();
		// 遍历考核
		for (User user : users) {
			// 创建考核vo
			UserVo UserVo = new UserVo();
			Assess assess = assessDao.findAssByDateAndUId(user.getuId(), startDate, endDate);
			if(assess != null){
				Grade grade = gradeDao.findGradeByGId(assess.getGradeId());
				UserVo.setGrade(grade);
			}
			UserVo.setuId(user.getuId());
			UserVo.setuName(user.getuName());
			UserVo.setAge(user.getAge());
			UserVo.setDaptName(user.getDept().getdName());
			UserVo.setEmpLevel(user.getEmpLevel().getLevel());
			UserVo.setInputDate(user.getInputDate());
			UserVo.setTel(user.getTel());;
			UserVo.setJob(user.getJob().getJob());
			UserVo.setSex(user.getSex());
			UserVo.setAssess(assess);			
			userVos.add(UserVo);
		}
		return userVos;
	}
}
