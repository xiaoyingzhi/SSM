package ccc.hut.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccc.hut.ssm.mapper.UserMapper;
import ccc.hut.ssm.po.User;
import ccc.hut.ssm.po.UserExample;
import ccc.hut.ssm.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int findUser(String username,int password) throws Exception {
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		
		criteria.andIdEqualTo(password);
		criteria.andUsernameEqualTo(username);
		return userMapper.countByExample(userExample);
	}
}
