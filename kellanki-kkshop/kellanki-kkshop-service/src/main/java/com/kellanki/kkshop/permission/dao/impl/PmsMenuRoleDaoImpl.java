package  com.kellanki.kkshop.permission.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.kellanki.kkshop.permission.dao.PmsMenuRoleDao;
import com.kellanki.kkshop.permission.entity.PmsMenuRole;

/**
 * 菜单角色
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
@Repository("pmsRoleMenuDao")
public class PmsMenuRoleDaoImpl extends PermissionBaseDaoImpl<PmsMenuRole> implements PmsMenuRoleDao {


	public void deleteByRoleId(Long roleId) {
		super.getSqlSession().delete(getStatement("deleteByRoleId"), roleId);
	}

	/**
	 * 根据角色ID统计关联到此角色的菜单数.
	 * 
	 * @param roleId
	 *            角色ID.
	 * @return count.
	 */
	public List<PmsMenuRole> listByRoleId(Long roleId) {
		return super.getSqlSession().selectList(getStatement("listByRoleId"), roleId);
	}
}