package com.jeecg.p3.weixin.entity;

import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>消息存储实体类<br>
 * @author LeeShaoQing
 * @since：2018年07月25日 16时02分13秒 星期三 
 * @version:1.0
 */
public class WeixinReceivetext implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	//update-begin--Author:zhangweijian  Date: 20180809 for：添加jwid字段
	
		return jwid;
	}
	public void setJwid(String jwid) {
		this.jwid = jwid;
	}
	/**
	//update-end--Author:zhangweijian  Date: 20180809 for：添加jwid字段
}
