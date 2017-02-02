package com.jobll.web.home;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@Repository("homeRepository")
public class HomeRepositoryImpl implements HomeRepository {
	
	protected static final Logger LOGGER = Logger.getLogger(HomeRepositoryImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int create (Home entity) throws Exception {
		return sqlSession.insert("com.jobll.web.home.Home.create", entity);
	}

	@Override
	public Home findOne (Home entity) throws Exception {
		return sqlSession.selectOne("com.jobll.web.home.Home.findOne", entity);
	}

}