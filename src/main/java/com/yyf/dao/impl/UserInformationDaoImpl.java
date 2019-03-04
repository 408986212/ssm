package com.yyf.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.yyf.dao.UserInformationDao;
import com.yyf.entity.UserInformation;

@Repository("userInformationDao")

public class UserInformationDaoImpl extends BaseDaoImpl<UserInformation> implements UserInformationDao{

	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


}
