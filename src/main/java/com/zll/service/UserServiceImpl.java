package com.zll.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zll.mapper.UserMapper;
import com.zll.pojo.User;
@Service
public class UserServiceImpl implements UserService{
    @Resource
	private UserMapper userMapper;
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}
	@Override
	public int delUd(Integer u_id) {
		// TODO Auto-generated method stub
		return userMapper.delUd(u_id);
	}
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}
	@Override
	public int addUd(Integer u_id, Integer d_id) {
		// TODO Auto-generated method stub
		return userMapper.addUd(u_id, d_id);
	}
	@Override
	public List<User> getUserList(Integer u_id) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(u_id);
	}
	@Override
	public int upUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.upUser(user);
	}
	@Override
	public int upUd(Integer u_id, Integer d_id) {
		// TODO Auto-generated method stub
		return userMapper.upUd(u_id, d_id);
	}

}
