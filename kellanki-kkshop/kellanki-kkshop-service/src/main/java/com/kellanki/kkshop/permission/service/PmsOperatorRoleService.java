package com.kellanki.kkshop.permission.service;

import java.util.List;
import java.util.Set;

import com.kellanki.kkshop.permission.entity.PmsOperator;
import com.kellanki.kkshop.permission.entity.PmsOperatorRole;

/**
 * 操作员角色service接口
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
public interface PmsOperatorRoleService {

	/**
	 * 根据操作员ID获得该操作员的所有角色id所拼成的String，每个ID用“,”分隔
	 * 
	 * @param operatorId
	 *            操作员ID
	 * @return roleIds
	 */
	public String getRoleIdsByOperatorId(Long operatorId);

	/**
	 * 根据操作员id，获取该操作员所有角色的编码集合
	 * 
	 * @param operatorId
	 * @return
	 */
	public Set<String> getRoleCodeByOperatorId(Long operatorId);

	/**
	 * 根据角色ID查询用户
	 * 
	 * @param roleId
	 * @return
	 */
	public List<PmsOperator> listOperatorByRoleId(Long roleId);

	/**
	 * 保存操作員信息及其关联的角色.
	 * 
	 * @param pmsOperator
	 *            .
	 * @param roleOperatorStr
	 *            .
	 */
	public void saveOperator(PmsOperator pmsOperator, String roleOperatorStr);

	/**
	 * 修改操作員信息及其关联的角色.
	 * 
	 * @param pmsOperator
	 *            .
	 * @param roleOperatorStr
	 *            .
	 */
	public void updateOperator(PmsOperator pmsOperator, String roleOperatorStr);

	/**
	 * 根据角色ID统计有多少个操作员关联到此角色.
	 * 
	 * @param roleId
	 *            .
	 * @return count.
	 */
	public int countOperatorByRoleId(Long roleId);

	/**
	 * 根据操作员ID获得所有操作员－角色关联列表
	 */
	public List<PmsOperatorRole> listOperatorRoleByOperatorId(Long operatorId);
	
	

}
