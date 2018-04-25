package com.kellanki.kkshop.permission.service;

import com.kellanki.kkshop.common.core.page.PageBean;
import com.kellanki.kkshop.common.core.page.PageParam;
import com.kellanki.kkshop.permission.entity.PmsOperatorLog;

/**
 * 操作员日志service接口
 *
 * 龙果学院：www.roncoo.com
 * 
 * @author：shenjialong
 */
public interface PmsOperatorLogService {

	/**
	 * 创建pmsOperatorLog
	 */
	void saveData(PmsOperatorLog pmsOperatorLog);

	/**
	 * 修改pmsOperatorLog
	 */
	void updateData(PmsOperatorLog pmsOperatorLog);

	/**
	 * 根据id获取数据pmsOperatorLog
	 * 
	 * @param id
	 * @return
	 */
	PmsOperatorLog getDataById(Long id);

	/**
	 * 分页查询pmsOperatorLog
	 * 
	 * @param pageParam
	 * @param ActivityVo
	 *            PmsOperatorLog
	 * @return
	 */
	PageBean listPage(PageParam pageParam, PmsOperatorLog pmsOperatorLog);

}
