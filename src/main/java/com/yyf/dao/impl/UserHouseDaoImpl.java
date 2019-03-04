package com.yyf.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.yyf.dao.UserHouseDao;
import com.yyf.entity.UserHouse;

@Repository("userHouseDao")	

public class UserHouseDaoImpl extends BaseDaoImpl<UserHouse> implements UserHouseDao{

	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

	@Override
	public List<UserHouse> queryV() {
		return getSqlSession().selectList(UserHouse.class.getSimpleName()+".queryV");
		
	}
}
