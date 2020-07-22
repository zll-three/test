package com.zll.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zll.mapper.DepartmentMapper;
import com.zll.pojo.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
         @Resource
         private DepartmentMapper departmentMapper;
	@Override
	public List<Department> getDepartmentList(String userName, Integer d_id) {
		// TODO Auto-generated method stub
		return departmentMapper.getDepartmentList(userName, d_id);
	}
	@Override
	public List<Department> getDepartmentlist() {
		// TODO Auto-generated method stub
		return departmentMapper.getDepartmentlist();
	}
	
}
