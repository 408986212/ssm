package com.yyf.dao;

import java.util.List;

import com.yyf.entity.UserHouse;

public interface UserHouseDao extends BaseDao<UserHouse>{
	public List<UserHouse> queryV();
}
