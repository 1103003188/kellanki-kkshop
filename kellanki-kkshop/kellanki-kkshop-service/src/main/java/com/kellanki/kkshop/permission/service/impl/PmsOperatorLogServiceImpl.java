package com.kellanki.kkshop.permission.service.impl;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellanki.kkshop.common.core.page.PageBean;
import com.kellanki.kkshop.common.core.page.PageParam;
import com.kellanki.kkshop.permission.dao.PmsOperatorLogDao;
import com.kellanki.kkshop.permission.entity.PmsOperatorLog;
import com.kellanki.kkshop.permission.service.PmsOperatorLogService;

/**
 * 操作员service接口实现
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
@Service("pmsOperatorLogService")
public class PmsOperatorLogServiceImpl implements PmsOperatorLogService {
	@Autowired
	private PmsOperatorLogDao pmsOperatorLogDao;

	/**
	 * 创建pmsOperator
	 */
	public void saveData(PmsOperatorLog pmsOperatorLog) {
		pmsOperatorLogDao.insert(pmsOperatorLog);
	}

	/**
	 * 修改pmsOperator
	 */
	public void updateData(PmsOperatorLog pmsOperatorLog) {
		pmsOperatorLogDao.update(pmsOperatorLog);
	}

	/**
	 * 根据id获取数据pmsOperator
	 * 
	 * @param id
	 * @return
	 */
	public PmsOperatorLog getDataById(Long id) {
		return pmsOperatorLogDao.getById(id);

	}

	/**
	 * 分页查询pmsOperator
	 * 
	 * @param pageParam
	 * @param ActivityVo
	 *            PmsOperator
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, PmsOperatorLog pmsOperatorLog) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		return pmsOperatorLogDao.listPage(pageParam, paramMap);
	}

}
