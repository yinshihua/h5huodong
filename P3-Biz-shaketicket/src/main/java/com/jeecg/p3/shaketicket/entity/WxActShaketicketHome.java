package com.jeecg.p3.shaketicket.entity;

import java.util.Date;
import java.util.List;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActShaketicketHome:九宫格活动表<br>
 * @author pituo
 * @since：2015年12月22日 19时03分50秒 星期二 
 * @version:1.0
 */
public class WxActShaketicketHome implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	/**
	 *创建人
	 */
	private String createBy;
	
	private Date deadlinetime;
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public Integer getCount() {
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	
	private List<WxActShaketicketConfig> awarsList;
	public List<WxActShaketicketConfig> getAwarsList() {
		return awarsList;
	}
	public void setAwarsList(List<WxActShaketicketConfig> awarsList) {
		this.awarsList = awarsList;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getDeadlinetime() {
		return deadlinetime;
	}
	public void setDeadlinetime(Date deadlinetime) {
		this.deadlinetime = deadlinetime;
	}
	private Date createTime;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 活动说明
	 */
	private String detail;
	
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * 短链接
	 */
	private String shortUrl;
	
	
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	/**
	 * 活动开始时间
	 */
	private Date beginTime;
	/**
	 * 活动结束时间
	 */
	private Date endTime;
	
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "WxActShaketicketHome [id=" + id + ", actName=" + actName
				+ ", activeFlag=" + activeFlag + ", template=" + template
				+ ", count=" + count + ", numPerDay=" + numPerDay + ", hdurl="
				+ hdurl + ", foucsUserCanJoin=" + foucsUserCanJoin
				+ ", bindingMobileCanJoin=" + bindingMobileCanJoin
				+ ", winCanJoin=" + winCanJoin + ", jwid=" + jwid
				+ ", jwidName=" + jwidName + ", projectCode=" + projectCode
				+ ", createBy=" + createBy + ", deadlinetime=" + deadlinetime
				+ ", awarsList=" + awarsList + ", createTime=" + createTime
				+ ", detail=" + detail + ", shortUrl=" + shortUrl + "]";
	}
	
}
