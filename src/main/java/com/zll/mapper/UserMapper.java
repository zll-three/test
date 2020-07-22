package com.zll.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zll.pojo.User;

public interface UserMapper {
     /**
      * 查询用户
      * @return
      */
	public List<User> getUserList();
	/**
	 * 解除用户关联
	 * @param u_id
	 * @return
	 */
	public int delUd(@Param("u_id")Integer u_id);
	  public int selectLastId();
	/**
	 * 增加用户
	 */
	public int addUser(User user);
	/**
	 * 增加绑定
	 */
	public int addUd(@Param("u_id")Integer u_id,@Param("d_id")Integer d_id);
	/**
	 * 用户回显数据
	 */
	public List<User> getUserList(@Param("u_id")Integer u_id);
	/**
	 * 修改用户
	 */
	public int upUser(User user);
	/**修改绑定
	 * 
	 */
	public int upUd(@Param("u_id")Integer u_id,@Param("d_id")Integer d_id);
}
