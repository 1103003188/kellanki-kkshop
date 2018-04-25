package com.kellanki.kkshop.permission.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kellanki.kkshop.permission.service.PmsMenuService;

/**
 * @author System
 * 
 * @since 2013-11-12
 */
@Component("pmsMenuBiz")
public class PmsMenuBiz {

	private static final Log log = LogFactory.getLog(PmsMenuBiz.class);

	@Autowired
	private PmsMenuService pmsMenuService;

	/**
	 * 鑾峰彇鐢ㄤ簬缂栧埗鑿滃崟鏃剁殑鏍�.
	 */
	@SuppressWarnings("rawtypes")
	public String getTreeMenu(String actionUrl) {
		List treeData = pmsMenuService.getListByParent(null);
		StringBuffer strJson = new StringBuffer();
		recursionTreeMenu("0", strJson, treeData, actionUrl);
		return strJson.toString();
	}

	/**
	 * 閫掑綊杈撳嚭鏍戝舰鑿滃崟
	 * 
	 * @param pId
	 * @param buffer
	 */
	@SuppressWarnings("rawtypes")
	private void recursionTreeMenu(String pId, StringBuffer buffer, List list, String url) {
		if (pId.equals("0")) {
			buffer.append("<ul class=\"tree treeFolder collapse \" >");
		} else {
			buffer.append("<ul>");
		}
		List<Map> listMap = getSonMenuListByPid(pId, list);
		for (Map map : listMap) {
			String id = map.get("id").toString();// id
			String name = map.get("name").toString();// 鍚嶇О
			String isLeaf = map.get("isLeaf").toString();// 鏄惁鍙跺瓙绉戠洰
			buffer.append("<li><a onclick=\"onClickMenuNode(" + id + ")\"  href=\"" + url + "?id=" + id + "\" target=\"ajax\" rel=\"jbsxBox\"  value=" + id + ">" + name + "</a>");
			if (!isLeaf.equals("1")) {
				recursionTreeMenu(id, buffer, list, url);
			}
			buffer.append("</li>");
		}
		buffer.append("</ul>");
	}

	/**
	 * 鏍规嵁(pId)鑾峰彇(menuList)涓殑鎵�鏈夊瓙鑿滃崟闆嗗悎.
	 * 
	 * @param pId
	 *            鐖惰彍鍗旾D.
	 * @param menuList
	 *            鑿滃崟闆嗗悎.
	 * @return sonMenuList.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<Map> getSonMenuListByPid(String pId, List menuList) {
		List sonMenuList = new ArrayList<Object>();
		for (Object menu : menuList) {
			Map map = (Map) menu;
			if (map != null) {
				String parentId = map.get("pId").toString();// 鐖秈d
				if (parentId.equals(pId)) {
					sonMenuList.add(map);
				}
			}
		}
		return sonMenuList;
	}

}