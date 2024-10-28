package com.entity.vo;

import com.entity.ZixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资讯信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public class ZixunxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资讯标题
	 */
	
	private String zixunbiaoti;
		
	/**
	 * 资讯类型
	 */
	
	private String zixunleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 资讯简介
	 */
	
	private String zixunjianjie;
		
	/**
	 * 资讯详情
	 */
	
	private String zixunxiangqing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：资讯标题
	 */
	 
	public void setZixunbiaoti(String zixunbiaoti) {
		this.zixunbiaoti = zixunbiaoti;
	}
	
	/**
	 * 获取：资讯标题
	 */
	public String getZixunbiaoti() {
		return zixunbiaoti;
	}
				
	
	/**
	 * 设置：资讯类型
	 */
	 
	public void setZixunleixing(String zixunleixing) {
		this.zixunleixing = zixunleixing;
	}
	
	/**
	 * 获取：资讯类型
	 */
	public String getZixunleixing() {
		return zixunleixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：资讯简介
	 */
	 
	public void setZixunjianjie(String zixunjianjie) {
		this.zixunjianjie = zixunjianjie;
	}
	
	/**
	 * 获取：资讯简介
	 */
	public String getZixunjianjie() {
		return zixunjianjie;
	}
				
	
	/**
	 * 设置：资讯详情
	 */
	 
	public void setZixunxiangqing(String zixunxiangqing) {
		this.zixunxiangqing = zixunxiangqing;
	}
	
	/**
	 * 获取：资讯详情
	 */
	public String getZixunxiangqing() {
		return zixunxiangqing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
