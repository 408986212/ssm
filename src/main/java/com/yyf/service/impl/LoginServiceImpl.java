package com.yyf.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyf.dao.LoginDao;
import com.yyf.entity.Login;
import com.yyf.service.LoginService;

@Service("loginService")
public class LoginServiceImpl extends BaseServiceImpl<Login> implements LoginService{

	@Resource
	   private LoginDao loginDao;

	@Override
	public Login login(Map<String, String> map) {
		map.put("username","username");
		map.put("password", "password");		
		return loginDao.login("username", "password");
	}

	

}
