package com.zll.pojo;

import java.util.List;

public class User {
    
	private int u_id;//用户id
	private String userName;//用户名称
	private String address;//用户地址
	private String role;//用户角色
	private int ud_id;
	public int getUd_id() {
		return ud_id;
	}
	public void setUd_id(int ud_id) {
		this.ud_id = ud_id;
	}
	private List<Department> departmentList;
	public List<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
