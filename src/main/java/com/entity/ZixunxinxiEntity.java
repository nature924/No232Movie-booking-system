package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资讯信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
@TableName("zixunxinxi")
public class ZixunxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZixunxinxiEntity() {
		
	}
	
	public ZixunxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资讯编号
	 */
					
	private String zixunbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资讯编号
	 */
	public void setZixunbianhao(String zixunbianhao) {
		this.zixunbianhao = zixunbianhao;
	}
	/**
	 * 获取：资讯编号
	 */
	public String getZixunbianhao() {
		return zixunbianhao;
	}
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
