package com.kellanki.kkshop.permission.dao;

import com.kellanki.kkshop.permission.domain.PmsOperator;
import com.kellanki.kkshop.common.core.dao.BaseDao;

public interface PmsOperatorDao extends BaseDao<PmsOperator> {

	/**
	 * 根据操作员登录名获取操作员信息.
	 * 
	 * @param loginName
	 *            .
	 * @return operator .
	 */
	PmsOperator findByLoginName(String loginName);
}
