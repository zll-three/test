package com.zll.pojo;

import java.util.List;

public class Department {
             private int d_id;//部门id
             private String d_name; //部门名称
             private List<User> userList;  //部门用户
             private int du_id;
			public int getDu_id() {
				return du_id;
			}
			public void setDu_id(int du_id) {
				this.du_id = du_id;
			}
			public int getD_id() {
				return d_id;
			}
			public void setD_id(int d_id) {
				this.d_id = d_id;
			}
			
			public String getD_name() {
				return d_name;
			}
			public void setD_name(String d_name) {
				this.d_name = d_name;
			}
			public List<User> getUserList() {
				return userList;
			}
			public void setUserList(List<User> userList) {
				this.userList = userList;
			}
              
}
