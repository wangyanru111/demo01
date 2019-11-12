package com.company.dao;

import java.util.List;
import com.company.pojo.Province;

/**
 * @author 李帅鹏
 *
 * @category 省份dao接口
 */
public interface ProvinceDao {

	/**
	 * 查询所有省份
	 * 
	 * @return 省份列表
	 */
	public List<Province> findProvinceAll();

	/**
	 * 根据省份id查询省份对象
	 * 
	 * @param provinceId
	 * @return
	 */
	public Province findProvince(int provinceId);
}
