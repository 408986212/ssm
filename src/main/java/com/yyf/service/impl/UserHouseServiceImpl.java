package com.yyf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyf.dao.UserHouseDao;
import com.yyf.entity.UserHouse;
import com.yyf.service.UserHouseService;

@Service("userHouseService")
public class UserHouseServiceImpl extends BaseServiceImpl<UserHouse> implements UserHouseService{

	@Resource
	   private UserHouseDao userHouseDao;

	@Override
	public List<UserHouse> queryV() {
		return userHouseDao.queryV();
	}


	

}
