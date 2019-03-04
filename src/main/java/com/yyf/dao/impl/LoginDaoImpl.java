package com.yyf.dao.impl;

import javax.annotation.Resource;

import com.yyf.dao.LoginDao;
import com.yyf.entity.Login;

public class LoginDaoImpl implements LoginDao{

	@Resource
	private LoginDao logindao;
	@Override
	public Login login(String username, String password) {
		// TODO Auto-generated method stub
		return logindao.login(username, password);
	}


}
