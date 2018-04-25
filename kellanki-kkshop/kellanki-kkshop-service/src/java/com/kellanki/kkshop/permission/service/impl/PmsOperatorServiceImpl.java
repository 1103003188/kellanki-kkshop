package com.kellanki.kkshop.permission.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellanki.kkshop.permission.dao.PmsOperatorDao;
import com.kellanki.kkshop.permission.domain.PmsOperator;
import com.kellanki.kkshop.permission.service.PmsOperatorService;

@Service("pmsOperatorService")
public class PmsOperatorServiceImpl implements PmsOperatorService {

	@Autowired
	private PmsOperatorDao pmsOperatorDao;
	
	@Override
	public PmsOperator findOperatorByLoginName(String loginName) {
		return pmsOperatorDao.findByLoginName(loginName);
	}

}
