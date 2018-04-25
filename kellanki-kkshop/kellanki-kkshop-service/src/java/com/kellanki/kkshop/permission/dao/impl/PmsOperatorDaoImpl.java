package com.kellanki.kkshop.permission.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kellanki.kkshop.permission.dao.PmsOperatorDao;
import com.kellanki.kkshop.permission.domain.PmsOperator;
import com.kellanki.kkshop.common.core.dao.impl.BaseDaoImpl;


@Repository
public class PmsOperatorDaoImpl extends BaseDaoImpl<PmsOperator> implements PmsOperatorDao {

	@Override
	public PmsOperator findByLoginName(String loginName) {
		return super.getSqlSession().selectOne(getStatement("findByLoginName"), loginName);
	}

	

}
