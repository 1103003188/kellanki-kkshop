package com.kellanki.kkshop.common.core.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.kellanki.kkshop.common.core.dao.BaseDao;

public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {

	 public static final String SQL_LIST_BY_COLUMN = "listByColumn";
	
	/**
    * 注入SqlSessionTemplate实例(要求Spring中进行SqlSessionTemplate的配置).
    * 可以调用sessionTemplate完成数据库操作.
    */
   @Autowired
   private SqlSessionTemplate sessionTemplate;

   public SqlSessionTemplate getSessionTemplate() {
       return sessionTemplate;
   }

   public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
       this.sessionTemplate = sessionTemplate;
   }

   public SqlSession getSqlSession() {
       return super.getSqlSession();
   }
	
	/**
	 *  函数功能说明 ：单条插入数据. 
	 */
	public int insert(T entity)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：批量插入数据. 
	 */
	public int insert(List<T> list)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：单条更新数据. 
	 */
	public int update(T entity)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：批量更新数据. 
	 */
	public int update(List<T> list)
	{		
		return 0;
	}
	
	 /**
    * 函数功能说明 ： 根据条件批量更新数据. 
    */
	public int update(Map<String, Object> paramMap)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：根据id删除数据. 
	 */
	public int delete(String id)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：批量删除数据. 
	 */
	public int delete(List<T> list)
	{		
		return 0;
	}
	
	 /**
    * 函数功能说明 ： 根据条件批量刪除数据. 
    */
	public int delete(Map<String, Object> paramMap)
	{		
		return 0;
	}
	
	/**
	 *  函数功能说明 ：根据id查询实体数据. 
	 */
	public T getById(String id)
	{		
		return null;
	}
	
	/**
	 *  函数功能说明 ：根据条件查询实体数据. 
	 */
	public T getBy(Map<String, Object> paramMap)
	{		
	     if (paramMap == null) {
	            return null;
	        }
	        return sessionTemplate.selectOne(getStatement(SQL_LIST_BY_COLUMN), paramMap);
	}
		
	
	/**
	 *  函数功能说明 ：根据条件查询实体列表数据. 
	 */
	public List<T> selectBy(Map<String, Object> paramMap)
	{		
		return null;
	}
	
   /**
    * 函数功能说明 ： 根据条件查询记录数. 
    */
	public Long getCountByColumn(Map<String, Object> paramMap)
	{		
		return null;
	}
	
	/**
    * 函数功能说明 ： 获取Mapper命名空间. 
    * @参数：@param sqlId
    * @参数：@return
    * @return：String
    * @throws
    */
   public String getStatement(String sqlId) {
       String name = this.getClass().getName();
       // 单线程用StringBuilder，确保速度；多线程用StringBuffer,确保安全
       StringBuilder sb = new StringBuilder();
       sb.append(name).append(".").append(sqlId);
       return sb.toString();
   }

}
