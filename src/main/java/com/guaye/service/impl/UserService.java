package com.guaye.service.impl;

import com.guaye.pojo.User;
import com.guaye.dao.UserMapper;
import com.guaye.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

}
