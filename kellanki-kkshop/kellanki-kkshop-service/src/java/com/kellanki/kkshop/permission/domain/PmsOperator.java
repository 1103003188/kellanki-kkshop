package com.kellanki.kkshop.permission.domain;

public class PmsOperator extends PermissionBaseEntity {

	private static final long serialVersionUID = 1L;
	private String loginName;// 登录名
	private String loginPwd; // 登录密码
	private String realName; // 姓名
	private String mobileNo; // 手机号
	private String type; // 操作员类型（admin:超级管理员，common:普通操作员），超级管理员由系统初始化时添加，不能删除
	private String salt;// 盐
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
