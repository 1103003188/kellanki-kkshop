package  com.kellanki.kkshop.permission.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.kellanki.kkshop.permission.dao.PmsOperatorDao;
import com.kellanki.kkshop.permission.entity.PmsOperator;

/**
 * 权限操作员dao实现
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
@Repository
public class PmsOperatorDaoImpl extends PermissionBaseDaoImpl<PmsOperator> implements PmsOperatorDao {

	/**
	 * 根据操作员登录名获取操作员信息.
	 * 
	 * @param loginName
	 *            .
	 * @return operator .
	 */

	public PmsOperator findByLoginName(String loginName) {
		return super.getSqlSession().selectOne(getStatement("findByLoginName"), loginName);
	}

	public List<PmsOperator> listByRoleId(Long roleId) {
		return super.getSqlSession().selectList(getStatement("listByRoleId"), roleId);
	}

}
