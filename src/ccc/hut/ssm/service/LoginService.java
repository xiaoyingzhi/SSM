package ccc.hut.ssm.service;

import ccc.hut.ssm.po.User;
import ccc.hut.ssm.po.UserExample;

public interface LoginService {

	public int findUser(String username,int password)throws Exception;

}
