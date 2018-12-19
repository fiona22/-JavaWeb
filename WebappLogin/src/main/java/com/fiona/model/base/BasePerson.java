package com.fiona.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePerson<M extends BasePerson<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}

	public java.lang.String getUserName() {
		return get("userName");
	}

	public void setAge(java.lang.Integer age) {
		set("age", age);
	}

	public java.lang.Integer getAge() {
		return get("age");
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		set("mobilePhone", mobilePhone);
	}

	public java.lang.String getMobilePhone() {
		return get("mobilePhone");
	}

}
