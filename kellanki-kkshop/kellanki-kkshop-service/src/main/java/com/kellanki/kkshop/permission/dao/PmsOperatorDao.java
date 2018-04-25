package com.kellanki.kkshop.permission.dao;

import java.util.List;

import com.kellanki.kkshop.permission.entity.PmsOperator;

/**
 * 操作员dao
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
public interface PmsOperatorDao extends PermissionBaseDao<PmsOperator> {

	/**
	 * 根据操作员登录名获取操作员信息.
	 * 
	 * @param loginName
	 *            .
	 * @return operator .
	 */
	PmsOperator findByLoginName(String loginName);

	/**
	 * 根据角色ID找到操作员列表.
	 * 
	 * @param roleId
	 * @return
	 */
	List<PmsOperator> listByRoleId(Long roleId);
}
