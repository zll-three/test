package com.zll.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zll.pojo.Department;

public interface DepartmentService {
	 /**
     * 用户部门
     * @return
     */
	public List<Department> getDepartmentList(@Param("userName")String userName,@Param("d_id")Integer d_id);
	/**
	 * 查询全部部门信息
	 */
	public List<Department> getDepartmentlist();
	
}
