package com.entity.vo;

import com.entity.DianyingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电影信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public class DianyingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 电影封面
	 */
	
	private String dianyingfengmian;
		
	/**
	 * 电影票数
	 */
	
	private Integer dianyingpiaoshu;
		
	/**
	 * 电影片段
	 */
	
	private String dianyingpianduan;
		
	/**
	 * 电影地区
	 */
	
	private String dianyingdiqu;
		
	/**
	 * 场次
	 */
	
	private String changci;
		
	/**
	 * 电影语言
	 */
	
	private String dianyingyuyan;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 主演
	 */
	
	private String zhuyan;
		
	/**
	 * 电影简介
	 */
	
	private String dianyingjianjie;
		
	/**
	 * 上映时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangyingshijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 座位总数
	 */
	
	private Integer number;
		
	/**
	 * 已选座位[用,号隔开]
	 */
	
	private String selected;
				
	
	/**
	 * 设置：电影类型
	 */
	 
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
	}
				
	
	/**
	 * 设置：电影封面
	 */
	 
	public void setDianyingfengmian(String dianyingfengmian) {
		this.dianyingfengmian = dianyingfengmian;
	}
	
	/**
	 * 获取：电影封面
	 */
	public String getDianyingfengmian() {
		return dianyingfengmian;
	}
				
	
	/**
	 * 设置：电影票数
	 */
	 
	public void setDianyingpiaoshu(Integer dianyingpiaoshu) {
		this.dianyingpiaoshu = dianyingpiaoshu;
	}
	
	/**
	 * 获取：电影票数
	 */
	public Integer getDianyingpiaoshu() {
		return dianyingpiaoshu;
	}
				
	
	/**
	 * 设置：电影片段
	 */
	 
	public void setDianyingpianduan(String dianyingpianduan) {
		this.dianyingpianduan = dianyingpianduan;
	}
	
	/**
	 * 获取：电影片段
	 */
	public String getDianyingpianduan() {
		return dianyingpianduan;
	}
				
	
	/**
	 * 设置：电影地区
	 */
	 
	public void setDianyingdiqu(String dianyingdiqu) {
		this.dianyingdiqu = dianyingdiqu;
	}
	
	/**
	 * 获取：电影地区
	 */
	public String getDianyingdiqu() {
		return dianyingdiqu;
	}
				
	
	/**
	 * 设置：场次
	 */
	 
	public void setChangci(String changci) {
		this.changci = changci;
	}
	
	/**
	 * 获取：场次
	 */
	public String getChangci() {
		return changci;
	}
				
	
	/**
	 * 设置：电影语言
	 */
	 
	public void setDianyingyuyan(String dianyingyuyan) {
		this.dianyingyuyan = dianyingyuyan;
	}
	
	/**
	 * 获取：电影语言
	 */
	public String getDianyingyuyan() {
		return dianyingyuyan;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：主演
	 */
	 
	public void setZhuyan(String zhuyan) {
		this.zhuyan = zhuyan;
	}
	
	/**
	 * 获取：主演
	 */
	public String getZhuyan() {
		return zhuyan;
	}
				
	
	/**
	 * 设置：电影简介
	 */
	 
	public void setDianyingjianjie(String dianyingjianjie) {
		this.dianyingjianjie = dianyingjianjie;
	}
	
	/**
	 * 获取：电影简介
	 */
	public String getDianyingjianjie() {
		return dianyingjianjie;
	}
				
	
	/**
	 * 设置：上映时间
	 */
	 
	public void setShangyingshijian(Date shangyingshijian) {
		this.shangyingshijian = shangyingshijian;
	}
	
	/**
	 * 获取：上映时间
	 */
	public Date getShangyingshijian() {
		return shangyingshijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：座位总数
	 */
	 
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	/**
	 * 获取：座位总数
	 */
	public Integer getNumber() {
		return number;
	}
				
	
	/**
	 * 设置：已选座位[用,号隔开]
	 */
	 
	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	/**
	 * 获取：已选座位[用,号隔开]
	 */
	public String getSelected() {
		return selected;
	}
			
}
