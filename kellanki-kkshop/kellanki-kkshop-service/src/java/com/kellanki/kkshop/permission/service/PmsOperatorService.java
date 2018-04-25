package com.kellanki.kkshop.permission.service;

import com.kellanki.kkshop.permission.domain.PmsOperator;

public interface PmsOperatorService {

	/**
	 * 根据登录名取得操作员对象
	 */
	PmsOperator findOperatorByLoginName(String loginName);
}
