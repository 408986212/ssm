package com.yyf.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyf.dao.HouseDao;
import com.yyf.entity.House;
import com.yyf.service.HouseService;
@Service("HouseService")

public class HouseServiceImpl extends BaseServiceImpl<House> implements HouseService{
	@Resource
	private HouseDao houseDao;
}
