package com.yyf.service;

import java.util.Map;

import com.yyf.entity.Login;

public interface LoginService extends BaseService<Login>{
	public Login  login(Map<String,String> map);

}
