package com.yyf.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyf.dao.UserInformationDao;
import com.yyf.entity.UserInformation;
import com.yyf.service.UserInformationService;
@Service("UserInformationService")

public class UserInformationServiceImpl extends BaseServiceImpl<UserInformation> implements UserInformationService{
	@Resource
	private UserInformationDao userInformationDao;
}
