package com.yyf.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.yyf.dao.HouseDao;
import com.yyf.dao.UserInformationDao;
import com.yyf.entity.House;
import com.yyf.entity.UserInformation;

@Repository("houseDao")

public class HouseDaoImpl extends BaseDaoImpl<House> implements HouseDao{

	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

}
